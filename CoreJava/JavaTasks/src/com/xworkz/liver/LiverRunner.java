package com.xworkz.liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver=new Liver();
        Body body=new Body();

        if(body!=null){
            body.liverFunction(liver);
        }
        else{
            System.err.println("body is null");
        }
    }
}
