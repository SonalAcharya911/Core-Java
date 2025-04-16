package com.xworkz.overriding.internal;

public class Agent {
    private String name;
    private int minBudget;

    public Agent(String name,int minBudget){
        this.minBudget=minBudget;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", minBudget=" + minBudget +
                '}';
    }

    public Agent(){
        System.out.println("no-arg constructor for Agent");
    }
    public void deal(){
        System.out.println("running deal in Agent");
    }
}
