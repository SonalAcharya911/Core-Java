package com.xworkz.caspsules.runner;

public class Prime {
    public boolean isPrime(int number) {
        if (number< 2) {
            return false;
        }

        for (int i=2;i<=Math.sqrt(number);i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public void isRepeated(int[] arr){

        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]+" is repeated");
                }
            }
        }
    }
}
