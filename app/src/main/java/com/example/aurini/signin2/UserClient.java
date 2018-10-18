package com.example.aurini.signin2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserClient {
    public static final String BASE_URL = "http://aipmrs.aponjon.com.bd/";
    private static Retrofit retrofit = null;
  static Gson gson = new GsonBuilder().setLenient().create();

    public static Retrofit getClient() {
        if (retrofit == null) {


            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}
