package com.xworkz.groupism.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Curse {
    public static void main(String[] args) {
        Collection<String> curse1=new ArrayList<>();
        curse1.add("go to hell");
        curse1.add("fall into deep sleep");
        curse1.add("die");

        Collection<String>curse2=new ArrayList<>();
        curse2.add("die");
        curse2.add("go to hell");
        curse2.add("fall into deep sleep");

        if(curse1.equals(curse2)){//1
            System.out.println("contains same data");
        }
        else {
            System.out.println("does not contain same data");
        }

        boolean result=curse1.containsAll(curse2);//2
        System.out.println(result);

        System.out.println("============");

        curse1.addAll(curse2);//3
        for(String curse: curse1){
            System.out.println(curse);
        }

        curse1.removeAll(curse2);//4
        for(String curse: curse1){
            System.out.println(curse);
        }

        Iterator<String> iterator=curse1.iterator();//5
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        result= curse1.isEmpty();//6
        System.out.println(result);

        result=curse1.contains("die");//7
        System.out.println(result);

        curse1.clear();//8
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        curse1.retainAll(curse2);//9
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(curse1.size()+" is the size");//10

        while(iterator.hasNext()){
            if(iterator.next().equals("die")){
                iterator.remove();//11
            }

        }

        curse1.remove("go to hell");//12

        curse1.stream().iterator();//13

        System.out.println("hashcode for curse1: "+curse1.hashCode());//14

        Object[] newCurses=curse2.toArray();
        System.out.println(newCurses);//15












    }
}
