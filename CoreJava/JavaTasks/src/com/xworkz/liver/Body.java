package com.xworkz.liver;

public class Body {
    Liver liver;
    public Body(Liver liver){
        this.liver=liver;
        System.out.println("parameterized constructor for Body");
    }
    public void liverFunction(){
        System.out.println("running liverFunction in Body");
        if(liver!=null){
            liver.produceBile();
        }
        else{
            System.err.println("liver is null");
        }
    }
}
