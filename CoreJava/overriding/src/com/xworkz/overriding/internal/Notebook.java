package com.xworkz.overriding.internal;

public class Notebook {
    private int pages;
    private String coverType;

    public Notebook(int pages, String coverType){
        this.pages = pages;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        System.out.println("pages: " + pages);
        System.out.println("coverType: " + coverType);
        return "";
    }

    public Notebook(){
        System.out.println("no-arg constructor for Notebook");
    }
    public void writeNotebook() {
        System.out.println("running writeNotebook in Notebook");
    }
}
