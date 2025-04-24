package com.xworkz.golden.external;

import com.xworkz.golden.internal.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void ride(){
        System.out.println("running ride in Car");
        if(this.engine!=null){
            this.engine.start();
        }
        else{
            System.out.println("engine is null");
        }
    }
}
