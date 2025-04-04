package com.xworkz.sweet;

import java.util.Objects;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet=new Sweet();
        Box box=new Box(sweet);
        box.open();
    }
}
