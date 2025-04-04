package com.xworkz.gold;
public class GoldRunner {
    public static void main(String... args){
        Gold gold = new Gold();
        Jewellers jewellers = new Jewellers();

        if (jewellers != null) {
            jewellers.sell(gold);
        }

    }
}
