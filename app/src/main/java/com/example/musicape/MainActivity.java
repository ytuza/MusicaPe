package com.example.musicape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.example.musicape.Recomend.FullGridMusic;
import com.example.musicape.Recomend.Recom;
import com.example.musicape.interfas.SpotifyRecom;
import com.example.musicape.interfas.SpotifySearch;
import com.example.musicape.interfas.SpotifySearchArt;
import com.example.musicape.search.Search;
import com.example.musicape.song.SearchArtist;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.annotations.SerializedName;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.types.Track;
import com.squareup.picasso.Picasso;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public class MainActivity extends AppCompatActivity {
    private static final String CLIENT_ID = "147022a992544f348ace4bb1b5219f55";
    private static final String REDIRECT_URI = "http://com.yourdomain.yourapp/callback";
    private SpotifyAppRemote mSpotifyAppRemote;
    private ProgressBar myProgressBar;

    private String seedIDArt = "";
    private String seedArt = "";

    private String seedIDTra = "";
    private String seedTra = "";

    private Boolean swich;


    private GridView mGridView;

    private FullGridMusic adapterM;




    private void populateMusic(Recom recom){
        mGridView = findViewById(R.id.gView);
        adapterM = new FullGridMusic(this, recom);

        mGridView.setAdapter(adapterM);
    }


    private void getPosts(String limit){
        ProgressBar myProgressBar = findViewById(R.id.myPorgressbar);

        String seed_a = null;
        String seed_m = null;

        if(seedArt.length() > 0){
            seed_a = seedIDArt.substring(1);
        }
        if(seedTra.length() > 0){
            seed_m = seedIDTra.substring(1);
        }


        String BASE_URL = "https://api.spotify.com/v1/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SpotifyRecom spotifyRecom = retrofit.create(SpotifyRecom.class);
        String token = getString(R.string.token);


        Call<Recom> call = spotifyRecom.getRecom( "Bearer "+ token, limit,seed_a,null,seed_m);


        call.enqueue(new Callback<Recom>() {
            @Override
            public void onResponse(Call<Recom> call, Response<Recom> response) {
                myProgressBar.setVisibility(View.GONE);
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "CODIGO: " + response.code(), Toast.LENGTH_LONG).show();
                    return;
                }
                Recom recom = response.body();
                Log.d("recom",  recom.toString());
                Log.d("recom1", String.valueOf(recom.getTracks().size()));
                populateMusic(recom);
            }

            @Override
            public void onFailure(Call<Recom> call, Throwable t) {
                myProgressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "MSJ: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }


    private  void editSemilla(){

        TextView Seed = (TextView)findViewById(R.id.SeedTV);
        String tmp = "Semilla:";
        if(seedArt.length() > 0){
            tmp = tmp + " "+ seedArt.substring(1) ;
        }
        if(seedTra.length() > 0){
            tmp = tmp + " "+ seedTra.substring(1) ;
        }

        Seed.setText(tmp);

    }


    private void getSearch(String limit, String q,String tipo){

        ImageView art_seed = (ImageView)findViewById(R.id.seed_artist);

        String BASE_URL = "https://api.spotify.com/v1/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SpotifySearch spotifySearch= retrofit.create(SpotifySearch.class);
        String token = getString(R.string.token);
        Call<Search> call = spotifySearch.getSearch( "Bearer "+ token,q,tipo,limit);
        call.enqueue(new Callback<Search>() {
            @Override
            public void onResponse(Call<Search> call, Response<Search> response) {
                myProgressBar.setVisibility(View.GONE);
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "CODIGOX: " + response.code(), Toast.LENGTH_LONG).show();
                    return;
                }
                Search search = response.body();

                Log.d("search",  search.toString());


                if(search.getArtists().getItems().get(0).getImages().get(0).getUrl() != null &&
                        search.getArtists().getItems().get(0).getImages().get(0).getUrl().length()>0){
                    Picasso.get().load(search.getArtists().getItems().get(0).getImages().get(0).getUrl())
                            .placeholder(R.drawable.ic_launcher_foreground).into(art_seed);
                }else{
                    Toast.makeText( MainActivity.this,"Empty Image URL", Toast.LENGTH_LONG).show();
                    Picasso.get().load(R.drawable.ic_launcher_foreground).into(art_seed);
                }

                seedArt = seedArt+ "," + search.getArtists().getItems().get(0).getName();
                seedIDArt = seedIDArt + "," + search.getArtists().getItems().get(0).getUri().split(":")[2];



                Log.d("searchART", seedArt);
                Log.d("searchX", seedIDArt);



                editSemilla();


            }

            @Override
            public void onFailure(Call<Search> call, Throwable t) {
                myProgressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "MSJ: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }

    private void getSearchArt(String limit, String q, String tipo){

        ImageView art_seed = (ImageView)findViewById(R.id.seed_artist);

        String BASE_URL = "https://api.spotify.com/v1/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SpotifySearchArt spotifySearch= retrofit.create(SpotifySearchArt.class);
        String token = getString(R.string.token);
        Call<SearchArtist> call = spotifySearch.getSearchA( "Bearer "+ token,q,tipo,limit);
        call.enqueue(new Callback<SearchArtist>() {
            @Override
            public void onResponse(Call<SearchArtist> call, Response<SearchArtist> response) {
                myProgressBar.setVisibility(View.GONE);
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "CODIGOX: " + response.code(), Toast.LENGTH_LONG).show();
                    return;
                }
                SearchArtist search = response.body();

                Log.d("search",  search.toString());


                if(search.getTracks().getItems().get(0).getAlbum().getImages().get(0).getUrl() != null &&
                        search.getTracks().getItems().get(0).getAlbum().getImages().get(0).getUrl().length()>0){
                    Picasso.get().load(search.getTracks().getItems().get(0).getAlbum().getImages().get(0).getUrl())
                            .placeholder(R.drawable.ic_launcher_foreground).into(art_seed);
                }else{
                    Toast.makeText( MainActivity.this,"Empty Image URL", Toast.LENGTH_LONG).show();
                    Picasso.get().load(R.drawable.ic_launcher_foreground).into(art_seed);
                }

                seedTra = seedTra+ "," + search.getTracks().getItems().get(0).getName();
                seedIDTra = seedIDTra + "," + search.getTracks().getItems().get(0).getUri().split(":")[2];

                editSemilla();

            }

            @Override
            public void onFailure(Call<SearchArtist> call, Throwable t) {
                myProgressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "MSJ: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }

    public void Ocultar(View v){

        TableLayout table = (TableLayout)findViewById(R.id.seedT);

        if(swich){
            ViewGroup.LayoutParams params = table.getLayoutParams();
            params.height  = 0;

            table.setLayoutParams(params);

            swich = false;
        }else{
            ViewGroup.LayoutParams params = table.getLayoutParams();
            params.height  = ViewGroup.LayoutParams.WRAP_CONTENT;

            table.setLayoutParams(params);
            swich = true;

        }


    }


    public void buscar(View view){

        EditText artist = (EditText)findViewById(R.id.artistaTV) ;

        getSearch("2", artist.getText().toString(),"artist");

        artist.setText("");

    }

    public void buscarMusic(View view){

        EditText musica = (EditText)findViewById(R.id.songTV) ;

        getSearchArt("2", musica.getText().toString(),"track");


        musica.setText("");

    }

    public void Recomendar(View v){

        EditText limit = (EditText)findViewById(R.id.limitTV) ;
        String l_str = limit.getText().toString();

        getPosts(l_str);
    }

    public void clear(View v){
        seedIDArt = "";
        seedArt = "";
        seedIDTra = "";
        seedTra= "";

        TextView Seed = (TextView)findViewById(R.id.SeedTV);
        Seed.setText("Semilla: " );
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seedArt = "";
        seedIDArt = "";
        swich = true;
        myProgressBar = findViewById(R.id.myPorgressbar);

        myProgressBar.setIndeterminate(true);
        myProgressBar.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onStart() {
        super.onStart();
        // We will start writing our code here.
        ConnectionParams connectionParams =
                new ConnectionParams.Builder(CLIENT_ID)
                        .setRedirectUri(REDIRECT_URI)
                        .showAuthView(true)
                        .build();

        SpotifyAppRemote.connect(this, connectionParams,
                new Connector.ConnectionListener() {

                    @Override
                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
                        mSpotifyAppRemote = spotifyAppRemote;
                        Log.d("MainActivity", "Connected! Yay!");

                        // Now you can start interacting with App Remote
                        //connected();
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        Log.e("MainActivity", throwable.getMessage(), throwable);

                        // Something went wrong when attempting to connect! Handle errors here
                    }
                });

        //ImageView imgs = findViewById(R.id.img1);
        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imgs);

    }

    public void connected(String keyMusic ) {
        // Then we will write some more code here.

        mSpotifyAppRemote.getPlayerApi().play(keyMusic);

        mSpotifyAppRemote.getPlayerApi()
                .subscribeToPlayerState()
                .setEventCallback(playerState -> {
                    final Track track = playerState.track;
                    if (track != null) {
                        Log.d("recomN", track.name + " by " + track.artist.name);
                    }
                });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Aaand we will finish off here.
        SpotifyAppRemote.disconnect(mSpotifyAppRemote);
    }

}