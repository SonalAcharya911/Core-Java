package com.xworkz.papa.runne;

import com.xworkz.papa.Child;
import com.xworkz.papa.Parent;

public class ParentRunner {
    public static void findSquareRoot(int number){
        int temp=0;
        int i=0;
        for( i=1;i<=(number/2);i++){
            temp=i;
            temp=temp+2;
        }
        if(temp==number){
            System.out.println("the square root is "+i);
        }
        else{
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        findSquareRoot(9);


    }
}
