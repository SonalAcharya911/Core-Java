package com.xworkz.overriding.internal;

public class Book {
    private String title;
    private int pages;
    public Book(String title,int pages){
        this.title=title;
        this.pages=pages;
    }

    @Override
    public String toString() {
        System.out.println(title);
        System.out.println(pages);
        return "";
    }
    public Book(){
        System.out.println("no-arg constructor for Book");
    }
    public void open() {
        System.out.println("running open in Book");
    }
}
