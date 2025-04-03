package com.xworkz.liver;

public class Body {
    public void liverFunction(Liver liver){
        System.out.println("running liverFunction in Body");
        if(liver!=null){
            liver.produceBile();
        }
        else{
            System.err.println("liver is null");
        }
    }
}
