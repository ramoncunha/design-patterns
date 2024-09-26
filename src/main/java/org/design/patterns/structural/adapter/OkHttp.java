package org.design.patterns.structural.adapter;

import okhttp3.OkHttpClient;

public class OkHttp implements Http {
    private final OkHttpClient client;

    public OkHttp(OkHttpClient client) {
        this.client = client;
    }

    @Override
    public Object get(String url, Object body) {
        return null;
    }

    @Override
    public Object post(String url, Object body) {
        return null;
    }
}
