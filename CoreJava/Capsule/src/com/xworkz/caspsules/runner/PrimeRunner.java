package com.xworkz.caspsules.runner;

public class PrimeRunner {
    public static void main(String[] args) {
        int num=24;
        Prime prime =new Prime();
        /*
        boolean result= prime.isPrime(num);
        if(result){
            System.out.println(num+" is prime");
        }
        else{
            System.out.println(num+" is not prime");
        }

        */

        int[] arr={2,3,5,8,2,1,9,7};
        prime.isRepeated(arr);

    }
}
