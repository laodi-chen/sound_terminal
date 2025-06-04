package com.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtils {
    private static final OkHttpClient client = new OkHttpClient();

    public static String get(String url) throws Exception {
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}
