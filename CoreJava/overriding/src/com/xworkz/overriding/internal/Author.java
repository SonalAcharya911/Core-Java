package com.xworkz.overriding.internal;

public class Author {
    private int noOfBooks;
    private int experiennce;

    public Author(int noOfBooks,int experiennce){
        this.experiennce=experiennce;
        this.noOfBooks=noOfBooks;
    }

    @Override
    public String toString() {
        System.out.println(experiennce);
        System.out.println(noOfBooks);
        return "";

    }

    public Author(){
        System.out.println("no-arg constructor for Author");
    }
    public void write() {
        System.out.println("running write in Author");
    }
}
