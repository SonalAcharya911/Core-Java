package com.xworkz.overriding.internal;

public class PenPencil extends Pencil{
    public PenPencil(){
        System.out.println("no-arg constructor for PenPencil");
    }
    public void writeWithPenPencil() {
        System.out.println("running writeWithPenPencil in PenPencil");
    }


    public void usePencil() {
        System.out.println("running usePencil in PenPencil");
    }
}
