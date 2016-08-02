package com.escmobile.okhttpsample;

import android.os.AsyncTask;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by genctasbasi on 11/04/15.
 */
public class OkHttpHandler extends AsyncTask<Void, Void, String> {

    // TODO: replace with your own image url
    private final String IMAGE_URL = "https://api.cloudsightapi.com/image_responses/PNjED6wJGmqH0hsCdn4qVQ";
    // String token = "";

    OkHttpClient httpClient = new OkHttpClient();

    @Override
    protected String doInBackground(Void... params) {

//        String locale = "en-us";
//
//
//
//        RequestBody formBody = new FormEncodingBuilder()
//                .add("remote_image_url", "https://cdn4.iconfinder.com/data/icons/buffet-set/100/pizza-512.png")
//                .add("local", locale)
//                .add("language", locale)
//                .build();
//
//        Request postRequest = new Request.Builder()
//                .url("https://api.cloudsightapi.com/image_responses/")
//                .post(formBody)
//                .addHeader("Authorization", "CloudSight KdhhSCGRrHIE31Vt8bFVxw")
//                .build();
//
//        try {
//            Response postResponse = httpClient.newCall(postRequest).execute();
//
//            JSONObject postJSON = null;
//            try {
//                postJSON = new JSONObject(postResponse.body().string());
//                token = postJSON.getString("token");
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Request.Builder builder = new Request.Builder();
        builder.url(IMAGE_URL);
        builder.addHeader("Authorization", "CloudSight KdhhSCGRrHIE31Vt8bFVxw");


        Request request = builder.build();

        try {

            Response response = httpClient.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
        }

        return null;
    }

}
