package com.example.mylibrary;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.List;

public interface ArtistApiService {
    @GET("artists/byLetter")
    Call<List<String>> getArtistsByLetter(@Query("letter") String letter);

    @GET("artists/byType")
    Call<List<String>> getArtistsByType(@Query("type") String type);
}