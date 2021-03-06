package com.example.aurini.signin2;

import android.util.Base64;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;


public interface APIinterface {

    @Headers({"Content-Type: text/html"})  //for multiple headers and setting the content type
    @POST("/api/registration/")
    Call<User> getUser(@Header("Authorization") String header, @Body UserRequestClass userRequestClass); //because of raw data 


}
