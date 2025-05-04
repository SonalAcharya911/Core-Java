package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.internal.PrimeNumber;

public class PrimeNumberRunner {
    public static void main(String[] args) {
        PrimeNumber primeNumber= (num)->{
            System.out.println("running checkPrime in PrimeNumberRunner");
            if (num<=1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;  // Divisible by a number other than 1 and itself
                }
            }
            return true;
        };

        primeNumber.checkPrime(10);
    }
}
