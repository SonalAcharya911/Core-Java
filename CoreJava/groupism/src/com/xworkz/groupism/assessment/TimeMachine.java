package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;

public class TimeMachine {
    public static void main(String[] args) {
        Collection<String> timeMachineParts1=new ArrayList<>();
        timeMachineParts1.add("gear");
        timeMachineParts1.add("window");
        timeMachineParts1.add("clock");

        Collection<String>timeMachineParts2=new ArrayList<>();
        timeMachineParts2.add("chair");
        timeMachineParts2.add("handle");
        timeMachineParts2.add("window");
        timeMachineParts2.clear();


        if(timeMachineParts2.containsAll(timeMachineParts2)){
            System.out.println("contains same data");
        }
        else {
            System.out.println("does not contain same data");
        }


    }
}
