package com.example.musicape.interfas;

import com.example.musicape.song.SearchArtist;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface SpotifySearchArt {
    @Headers({"Accept: application/json","Content-Type: application/json"})
    @GET("search")
    Call<SearchArtist> getSearchA(@Header("Authorization") String authHeader, @Query("q") String q,
                                 @Query("type") String type, @Query("limit") String limit);
}

