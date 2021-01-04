package com.daimler.spring5_demo2.collectiontype;

import java.util.Arrays;
import java.util.List;

public class Book {
    private List<String> books;

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void show(){
        System.out.println(books);
    }
}
