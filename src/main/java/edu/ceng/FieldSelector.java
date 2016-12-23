package edu.ceng;

import java.util.function.Function;


public class FieldSelector implements Function<Article, String>{

    private FIELD field;

    public FieldSelector(FIELD field) {

        this.field = field;
    }

    @Override
    public String apply(Article article) {

        if(field == FIELD.title)
            return article.title;

        else
            return article.content;
    }
}