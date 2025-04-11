package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.*;

public class Runner {
    public static void main(String[] args) {
        Piano piano=new Piano();
        Piano piano1=new Keyboard();
        piano1.play();

        Keyboard keyboard=new Keyboard();
        keyboard.play();
        keyboard.pressKey();

        System.out.println("=================================");
        Actor actor=new Actor();
        Actor actor1=new ShahRukhKhan();
        actor1.act();

        ShahRukhKhan shahRukhKhan=new ShahRukhKhan();
        shahRukhKhan.act();
        shahRukhKhan.smile();

        System.out.println("=================================");
        Actress actress=new Actress();
        Actress actress1=new Deepika();

        Deepika deepika=new Deepika();
        deepika.dance();
        deepika.perform();

    }
}
