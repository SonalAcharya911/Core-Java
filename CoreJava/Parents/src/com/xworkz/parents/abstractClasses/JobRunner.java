package com.xworkz.parents.abstractClasses;

public class JobRunner {
    public static void main(String[] args) {
        AbstractJob abstractJob=new Salesman("Sales Executive");
        abstractJob.work();
    }
}
