package com.example.musicape.Recomend;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.musicape.MainActivity;
import com.example.musicape.R;
import com.squareup.picasso.Picasso;

public class FullGridMusic extends BaseAdapter {
    private Recom recom;
    private Context context;

    public FullGridMusic(Context context,Recom recom){
        this.context = context;
        this.recom = recom;
    }

    @Override
    public int getCount(){
        return recom.getTracks().size();

    }

    @Override
    public Object getItem(int pos){
        return recom.getTracks().get(pos);

    }

    @Override
    public long getItemId(int pos){
        return pos;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){

        if(view == null){
            view= LayoutInflater.from(context).inflate(R.layout.model,viewGroup,false);
        }

        TextView nameTxt = view.findViewById(R.id.nameTextView);
        TextView txtPropellant = view.findViewById(R.id.prope);
        //CheckBox checkBox = view.findViewById(R.id.myCheckBox);
        ImageView spacecraftImage = view.findViewById(R.id.spacecraftImageView);

        final Track thisTrack = recom.getTracks().get(position);

        nameTxt.setText(thisTrack.getName());

        txtPropellant.setText(thisTrack.getArtists().get(0).getName());
        //checkBox.setChecked(thisSpacecraft.getTechnologyExists()==1);
        //checkBox.setEnabled(false);

        if(thisTrack.getAlbum().getImages().get(0).getUrl() != null && thisTrack.getAlbum().getImages().get(0).getUrl().length()>0){
            Picasso.get().load(thisTrack.getAlbum().getImages().get(0).getUrl()).placeholder(R.drawable.ic_launcher_foreground).into(spacecraftImage);
        }else{
            Toast.makeText(context,"Empty Image URL", Toast.LENGTH_LONG).show();
            Picasso.get().load(R.drawable.ic_launcher_foreground).into(spacecraftImage);
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thisTrack.getUri().length() > 0){
                    ((MainActivity) context).connected(thisTrack.getUri());

                    Log.d("recomMM",  thisTrack.getUri());
                    Log.d("recom5",  thisTrack.getExternalUrls().getSpotify());

                    Toast.makeText(context,thisTrack.getName(), Toast.LENGTH_LONG).show();
                }


            }
        });

        return view;
    }

}