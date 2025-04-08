package com.xworkz;

import com.xworkz.beach.external.Tourist;
import com.xworkz.beach.internal.Coast;
import com.xworkz.card.external.Games;
import com.xworkz.card.internal.ATM;
import com.xworkz.coin.external.PhoneBooth;
import com.xworkz.coin.internal.VendingMachine;
import com.xworkz.comb.external.Salon;
import com.xworkz.comb.internal.HairStyle;
import com.xworkz.drone.external.Student;
import com.xworkz.drone.internal.Police;
import com.xworkz.forest.external.Animal;
import com.xworkz.forest.internal.Forest;
import com.xworkz.forest.internal.Tribe;
import com.xworkz.jesus.external.Father;
import com.xworkz.jesus.internal.Priest;
import com.xworkz.perfume.external.Man;
import com.xworkz.perfume.internal.Lady;
import com.xworkz.powder.external.Carrom;
import com.xworkz.powder.internal.MakeUp;
import com.xworkz.shell.external.Oyester;
import com.xworkz.shell.internal.Mollusk;

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
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.take();
        System.out.println("=========================================");
        PhoneBooth phoneBooth=new PhoneBooth();
        phoneBooth.accepts();
        System.out.println("=========================================");

        System.out.println("COMB");
        Salon salon=new Salon();
        salon.holds();
        System.out.println("=========================================");
        HairStyle hairStyle=new HairStyle();
        hairStyle.brush();
        System.out.println("=========================================");

        System.out.println("DRONE");
        Police police=new Police();
        police.surveillance();
        System.out.println("=========================================");
        Student student=new Student();
        student.flies();
        System.out.println("=========================================");

        System.out.println("CHURCH");
        Father father=new Father();
        father.baptises();
        System.out.println("=========================================");
        Priest priest=new Priest();
        priest.preach();
        System.out.println("=========================================");

        System.out.println("PERFUME");
        Man man=new Man();
        man.wear();
        System.out.println("=========================================");
        Lady lady=new Lady();
        lady.spray();
        System.out.println("=========================================");

        System.out.println("POWDER");
        MakeUp makeUp=new MakeUp();
        makeUp.applies();
        System.out.println("=========================================");
        Carrom carrom=new Carrom();
        carrom.sprinkle();
        System.out.println("=========================================");

        System.out.println("SHELL");
        Mollusk mollusk=new Mollusk();
        mollusk.protect();
        System.out.println("=========================================");
        Oyester oyester=new Oyester();
        oyester.lives();
        System.out.println("=========================================");

        System.out.println("FOREST");
        Tribe tribe=new Tribe();
        tribe.livesIn();
        System.out.println("=========================================");
        Animal animal=new Animal();
        animal.hunt();


    }
}
