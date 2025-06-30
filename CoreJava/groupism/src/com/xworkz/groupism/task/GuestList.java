package com.xworkz.groupism.task;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GuestList {
    public static void main(String[] args) {
        Set<String> guests= new HashSet<>();//max speed(fastest)
        guests.add("Saahil");
        guests.add("Sonal");
        guests.add("Vidya");
        guests.add("Vinod");


        guests.add(null); //stores at the beginning
        guests.add(null);
        guests.add(null);
        guests.add("Sonal");//no duplicates
        //guests.clear(); //1
        System.out.println(guests);

        Set<String> guestNames=new HashSet<>();
        guestNames.add("Chandrababu");
        guestNames.add("Anil");
        guestNames.add("jaya");
        guestNames.add("meenu");
        System.out.println(guestNames);

        guests.addAll(guestNames); //2
        //guests.remove("meenu"); //3
        //guests.removeAll(guestNames); //4
        System.out.println(guests);
        boolean present=guests.containsAll(guests);//5
        System.out.println(present);






        System.out.println("================================================");

        Set<String> names=new TreeSet<>();//slowest
        names.add("Saahil");
        names.add("Sonal");
        names.add("Vidya");
        names.add("Vinod");
        names.add("Sonal");//no duplicates
        //names.add(null);  -----> //throws null pointer exception
        System.out.println(names);

        Set<String> cousins=new TreeSet<>();
        cousins.add("Chandrababu");
        cousins.add("Anil");
        cousins.add("jaya");
        cousins.add("meenu");
        cousins.add("Akhil");
        System.out.println(cousins);

        names.addAll(cousins); //2
        System.out.println(names);
        names.removeAll(cousins);
        System.out.println(names);
        System.out.println(names.contains("meenu")); //3
        names.remove("jaya");//4
        System.out.println(names);
        names.clear(); //5

        System.out.println(names.isEmpty());//6

        System.out.println(names);







    }
}
