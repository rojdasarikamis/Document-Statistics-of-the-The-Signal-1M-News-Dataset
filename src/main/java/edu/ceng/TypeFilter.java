package edu.ceng;


import java.util.function.Predicate;

public class TypeFilter implements Predicate<Article> {

    private TYPE type;

    public TypeFilter(TYPE type) {

        this.type = type;
    }

    @Override
    public boolean test(Article article) {

        return this.type == article.type;
    }
}