package com.xworkz.jesus.external;

import com.xworkz.jesus.internal.Church;

public class Father {
    public Father() {
        System.out.println("no-arg constructor in Father ");
    }
    public void baptises(){
        System.out.println("running baptises in Father");
        Church church=new Church();
        church.prayer();
    }
}
