package com.klar.quakeapp.network;

import com.klar.quakeapp.models.quake.QuakeModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MahmoudAyman on 05/05/2019.
 */
public interface ApiParser {

    @GET("query")
    Call<QuakeModel> get_quakes(@Query("format") String format,
                                @Query("minmagnitude") int minMagnitude);
}
