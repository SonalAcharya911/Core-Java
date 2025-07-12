package com.xworkz.linkedCustomer.runner;

public class ArrayRunner {
    public static void main(String[] args) {
        int[] arr=new int[]{1,34,65,78,32};

        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> large){
                large=arr[i];
            }
        }

        int secondLarge=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=large && arr[i]>secondLarge){
                secondLarge=arr[i];
            }
        }

        System.out.println(secondLarge);

    }
}
