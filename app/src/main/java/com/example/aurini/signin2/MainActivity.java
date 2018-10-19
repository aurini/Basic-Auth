package com.example.aurini.signin2;

import android.os.AsyncTask;
import android.support.constraint.solver.widgets.Helper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String authHeader2;
    private Button button_login_login;
    private EditText editText_login_username;
    private EditText editText_login_password;
    private String username;
    private String password;
    private String baseUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_login_username = (EditText) findViewById(R.id.editText_login_username);
        editText_login_password = (EditText) findViewById(R.id.editText_login_password);
        button_login_login = (Button) findViewById(R.id.button_login_login);


    }


    public void onClick(View v) {

            username = "fhi360";
            password = "FHI360d@2018";
            String auth= getAuthToken(username, password);
        String base = username +":"+ password;

       final String header = "Basic " + Base64.encodeToString("fhi360:FHI360d@2018".getBytes() , Base64.NO_WRAP);
        authHeader2 = "Basic"+" "+Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);

            Call<String> call = UserClient.getClient().create(APIinterface.class).getUser(header);

            call.enqueue(new Callback<String>() {
                             @Override
                             public void onResponse(Call<String> call, Response<String> response) {


                                 String message ="gghgfhg";
                                String m= response.headers().toString();
                                         boolean b=response.isSuccessful();
                                         int p= response.code();


                                 Log.e("tag 121",response.body());
                                // Log.e("tagg2", m+" \n"+" response"+b +"\n"+"code"+p+ "\n"+authHeader2);

                                 Toast.makeText(MainActivity.this, message,Toast.LENGTH_LONG).show();


                             }

                             @Override
                             public void onFailure(Call<String> call, Throwable t) {


                                 Log.e("eror12",  t+"");
                                 Toast.makeText(MainActivity.this, "Cannot access",Toast.LENGTH_LONG).show();


                             }


                         }
            );





    }
    public static String getAuthToken (String username1, String password1 ){
        byte[] data = new byte[0];
        try {
            data = (username1+ ":" +password1).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "Basic " + Base64.encodeToString(data, Base64.NO_WRAP);
    }
}
