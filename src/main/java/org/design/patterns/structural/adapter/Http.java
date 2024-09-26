package org.design.patterns.structural.adapter;

public interface Http {

    Object get(String url, Object body);
    Object post(String url, Object body);
}
