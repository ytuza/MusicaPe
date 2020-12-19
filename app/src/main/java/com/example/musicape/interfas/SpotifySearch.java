package com.example.musicape.interfas;

import com.example.musicape.search.Search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface SpotifySearch {

    @Headers({"Accept: application/json","Content-Type: application/json"})
    @GET("search")

    Call<Search> getSearch(@Header("Authorization") String authHeader, @Query("q") String q,
                           @Query("type") String type, @Query("limit") String limit);

}


