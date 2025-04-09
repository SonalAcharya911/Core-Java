package com.xworkz.caspsules.external;

import com.xworkz.caspsules.internal.KeyChain;

public class Key {
    public void unlock(){
        System.out.println("running unlock in Key");
        KeyChain keyChain = new KeyChain();

        System.out.println("KeyChain Name: " + keyChain.getName());
        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("KeyChain Keys: " + keyChain.getKeys());
        System.out.println("KeyChain Length: " + keyChain.getLength());
        System.out.println("KeyChain Custom: " + keyChain.getCustom());
    }
}
