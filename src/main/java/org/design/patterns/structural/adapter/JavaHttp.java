package org.design.patterns.structural.adapter;

import java.net.http.HttpClient;

public class JavaHttp implements Http {
    private final HttpClient client;

    public JavaHttp(HttpClient client) {
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
