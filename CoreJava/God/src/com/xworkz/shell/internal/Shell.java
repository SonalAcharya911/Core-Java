package com.xworkz.shell.internal;


public class Shell {
    public Shell(){
        System.out.println("no-arg constructor in Shell ");
    }

    public void cover(){
        System.out.println("running cover in Shell");
        breaks();
        collect();
    }

    void breaks(){
        System.out.println("running breaks in Shell");
    }

    private void collect(){
        System.out.println("running collect in Shell");
    }
}
