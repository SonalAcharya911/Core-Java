package com.xworkz.caspsules.runner;

import com.xworkz.caspsules.external.Fans;
import com.xworkz.caspsules.internal.Xmen;

public class Runner {
    public static void main(String[] args) {
        Xmen xmen=new Xmen();
        xmen.save();

        Fans fans=new Fans();
        fans.watch();


    }
}
