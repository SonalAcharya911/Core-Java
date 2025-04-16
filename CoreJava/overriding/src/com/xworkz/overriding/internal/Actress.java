package com.xworkz.overriding.internal;

public class Actress {
    private int no_of_awards;
    private String nationality;

    public Actress(String nationality,int no_of_awards){
        this.nationality=nationality;
        this.no_of_awards=no_of_awards;
    }

    @Override
    public String toString() {
        System.out.println("nationality: "+this.nationality+" no_of_awards: "+this.no_of_awards);
        return super.toString();
    }

    public Actress(){
        System.out.println("no-arg constructor for Actress");
    }

    public void dance(){
        System.out.println("running dance in Actress");
    }

}
