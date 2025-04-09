package com.xworkz.caspsules.internal;

public class Holder {
    public Holder(){
        System.out.println("no-arg constructor for Holder");
    }

    public void keep(){

        System.out.println("running keep in Holder");
        KeyChain keyChain = new KeyChain();

        System.out.println("KeyChain Name: " + keyChain.getName());
        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("KeyChain Keys: " + keyChain.getKeys());
        System.out.println("KeyChain Length: " + keyChain.getLength());
        System.out.println("KeyChain Custom: " + keyChain.getCustom());

        keyChain.setName("GripRing");
        keyChain.setMaterial("Leather");
        keyChain.setKeys(7);
        keyChain.setLength(7.2);
        keyChain.setCustom(true);

        System.out.println("updated KeyChain Name: " + keyChain.getName());
        System.out.println("updated KeyChain Material: " + keyChain.getMaterial());
        System.out.println("updated KeyChain Keys: " + keyChain.getKeys());
        System.out.println("updated KeyChain Length: " + keyChain.getLength());
        System.out.println("updated KeyChain Custom: " + keyChain.getCustom());
    }
}
