package com.klar.quakeapp.network;

import androidx.annotation.NonNull;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MahmoudAyman on 05/05/2019.
 */
public class MyRetrofit {
    private static final String DOMAIN = "https://earthquake.usgs.gov/";



    //this methode for http reuest debuggig...
    //in log debug mode serch for "okhttp" and u will see results
    private static OkHttpClient getHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    @NonNull
    public static Retrofit getBase() {
        return new Retrofit.Builder().baseUrl(DOMAIN + "fdsnws/event/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(getHttpClient())
                .build();
    }

}
