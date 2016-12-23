package edu.ceng;

import com.google.gson.Gson;

import java.util.function.Function;


public class JSonMapper implements Function<String, Article> {

    public static final Gson gson = new Gson();

    @Override
    public Article apply(String s) {

        return gson.fromJson(s, Article.class);
    }
}