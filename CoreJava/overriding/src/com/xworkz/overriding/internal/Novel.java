package com.xworkz.overriding.internal;

public class Novel extends Book{
    public Novel(){
        System.out.println("no-arg constructor for Novel");
    }
    public void open() {
        System.out.println("running open in Novel");
    }
    public void readNovel() {
        System.out.println("running readNovel in Novel");
    }

}
