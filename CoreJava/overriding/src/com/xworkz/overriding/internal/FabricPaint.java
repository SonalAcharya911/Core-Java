package com.xworkz.overriding.internal;

public class FabricPaint extends Paint{
    public FabricPaint(){
        System.out.println("no-arg constructor for FabricPaint");
    }
    public void paintFabric() {
        System.out.println("running paintFabric in FabricPaint");
    }

    public void applyPaint() {
        System.out.println("running applyPaint in Paint");
    }
}
