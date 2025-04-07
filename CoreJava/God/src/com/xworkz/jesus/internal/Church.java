package com.xworkz.jesus.internal;

public class Church {
    public Church() {
        System.out.println("no-arg constructor in Church ");
    }

    public void prayer() {
        System.out.println("running prayer in Church");
        wedding();
    }

    void wedding() {
        System.out.println("running wedding in Church");
        confess();
    }

    private void confess() {
        System.out.println("running confess in Church");
    }
}
