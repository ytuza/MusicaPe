package com.example.musicape.interfas;

import com.example.musicape.Recomend.Recom;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface SpotifyRecom {

    @Headers({"Accept: application/json","Content-Type: application/json"})
    @GET("recommendations")
    Call<Recom> getRecom(@Header("Authorization") String authHeader, @Query("limit") String limit,
                         @Query("seed_artists") String seed_artists, @Query("seed_genres") String seed_genres,
                         @Query("seed_tracks") String seed_tracks);

}


