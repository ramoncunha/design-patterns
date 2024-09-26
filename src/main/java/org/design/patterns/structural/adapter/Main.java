package org.design.patterns.structural.adapter;

import okhttp3.OkHttpClient;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
        Http client = new JavaHttp(HttpClient.newHttpClient());
        //Http client = new OkHttp(new OkHttpClient.Builder().build());

        client.get("any", "any");
        client.post("any", "any");
    }
}
