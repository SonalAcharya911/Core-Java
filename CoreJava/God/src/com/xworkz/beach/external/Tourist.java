package com.xworkz.beach.external;

import com.xworkz.beach.internal.Beach;

public class Tourist {
    public Tourist(){
        System.out.println("no-arg constructor for Tourist");
    }

    public void watches(){
        System.out.println("running watches in Tourist");
        Beach beach=new Beach();
        beach.sunset();
    }
}
