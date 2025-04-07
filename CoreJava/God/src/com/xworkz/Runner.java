package com.xworkz;

import com.xworkz.beach.external.Tourist;
import com.xworkz.beach.internal.Coast;
import com.xworkz.card.external.Games;
import com.xworkz.card.internal.ATM;

public class Runner {
    public static void main(String[] args) {
        System.out.println("BEACH/n");
        Tourist tourist=new Tourist();
        tourist.watches();
        System.out.println("=========================================");
        Coast coast=new Coast();
        coast.contains();
        System.out.println("=========================================");

        System.out.println("CARD");
        ATM atm=new ATM();
        atm.swipe();
        System.out.println("=========================================");
        Games games=new Games();
        games.play();
        System.out.println("=========================================");

        System.out.println("COIN");

    }
}
