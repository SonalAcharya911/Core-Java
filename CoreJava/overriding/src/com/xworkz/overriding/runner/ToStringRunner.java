package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.*;

public class ToStringRunner {
    public static void main(String[] args) {
        Actor actor=new Actor("Swadesh",100);
        System.out.println(actor);

        Actress actress=new Actress("Indian",20);
        System.out.println(actress);

        Agent agent=new Agent("palmtree",25);
        System.out.println(agent);

        Armor armor=new Armor("iron","grey");
        System.out.println(armor);

        Author author=new Author(5,10);
        System.out.println(author);





    }
}
