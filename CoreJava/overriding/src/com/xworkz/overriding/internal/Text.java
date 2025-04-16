package com.xworkz.overriding.internal;

public class Text {

    private String content;
    private String language;

    public void setContent(String content){
        this.content = content;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    @Override
    public String toString() {
        System.out.println("content: " + content);
        System.out.println("language: " + language);
        return "";
    }

    public Text(){
        System.out.println("no-arg constructor for Text");
    }
    public void sendText() {
        System.out.println("running sendText in Text");
    }
}
