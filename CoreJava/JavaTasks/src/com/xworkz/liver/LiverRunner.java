package com.xworkz.liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver=new Liver();
        Body body=new Body(liver);
        body.liverFunction();
    }
}
