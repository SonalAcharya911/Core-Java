package com.xworkz.appnest.runner;

import java.util.*;

public class AppList {
    public static void main(String[] args) {
        List<String> apps=new ArrayList<>();
        apps.add("1. Instagram");
        apps.add("2. SnapChat");
        apps.add("3. WhatsApp");
        apps.add("4. Threads");
        apps.add("5. Spotify");
        apps.add("6. Zoom");
        apps.add("7. Google Maps");
        apps.add("8. Telegram");
        apps.add("9. Netflix");
        apps.add("10. YouTube");
        apps.add("11. Swiggy");

        ListIterator<String> listIterator= apps.listIterator();
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.hasNext());
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//
//        System.out.println("==================");
//
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        System.out.println("=======================");

        System.out.println(listIterator.hasPrevious());
        while (listIterator.hasPrevious()){
            String str= listIterator.previous();
            if(str.equalsIgnoreCase("11. swiggy")){
                listIterator.set("11. Zomato");
                listIterator.add("12. Swiggy");
            }
        }

        System.out.println(listIterator.hasPrevious());

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }





    }
}
