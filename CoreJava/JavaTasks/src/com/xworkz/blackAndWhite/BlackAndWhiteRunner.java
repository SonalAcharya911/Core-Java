package com.xworkz.blackAndWhite;

import java.util.Objects;

public class BlackAndWhiteRunner {
    public static void main(String... args){

        BlackAndWhite blackAndWhite=new BlackAndWhite();
        Television television=new Television();

        if(Objects.nonNull(television)){
            television.channel(blackAndWhite);
        }
        else{
            System.err.println("television is null");
        }

    }
}
