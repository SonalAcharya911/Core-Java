package com.xworkz.acquired.runner;

import com.xworkz.acquired.internal.*;
import com.xworkz.acquired.internal.Thread;

public class Runner {
    public static void main(String[] args) {
        Food food1=new Snack();
        Food foos2=new Biscuit();
        Food food3=new GoodDayBiscuit();

        Snack snack=new Snack();
        snack.bake();
        Snack snack1=new Biscuit();
        Snack snack2=new GoodDayBiscuit();

        Biscuit biscuit= new Biscuit();
        Biscuit biscuit1 = new GoodDayBiscuit();
        biscuit1.eat();

        GoodDayBiscuit goodDayBiscuit=new GoodDayBiscuit();
        goodDayBiscuit.dip();

        System.out.println("======================");
        Tap tap=new Tap();
        tap.open();

        System.out.println("======================");
        Omlet omlet=new Omlet();
        omlet.eat();

        System.out.println("======================");
        Actor actor=new Actor();
        actor.act();

        System.out.println("======================");
        Revolver revolver=new Revolver();
        revolver.shoot();

        System.out.println("======================");
        Cactus cactus=new Cactus();
        cactus.prick();

        System.out.println("======================");
        Thread thread=new Thread();
        thread.weave();

        System.out.println("======================");
        Lock lock=new Lock();
        lock.unlock();

        System.out.println("======================");
        LED led=new LED();
        led.off();

        System.out.println("======================");
        Sneaker sneaker=new Sneaker();
        sneaker.wear();

        System.out.println("======================");
        Sofa sofa=new Sofa();
        sofa.sit();




        
    }
}
