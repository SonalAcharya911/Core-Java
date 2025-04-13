package com.xworkz.overriding.runner;

import com.xworkz.overriding.external.TypeCasting;
import com.xworkz.overriding.internal.*;
import javafx.util.Builder;

public class TypeCastRunner {
    public static void main(String[] args) {
        TypeCasting typeCasting=new TypeCasting();


        Actor actor =new Actor();
        ShahRukhKhan shahRukhKhan=new ShahRukhKhan();

        typeCasting.increaseFans(actor);
        typeCasting.increaseFans(shahRukhKhan);

        Actress actress=new Actress();
        Deepika deepika=new Deepika();

        typeCasting.giveAudition(actress);
        typeCasting.giveAudition(deepika);

        Agent agent=new Agent();
        Broker broker=new Broker();

        typeCasting.bookHouse(broker);
        typeCasting.bookHouse(agent);

        Notification notification=new Notification();
        Alarm alarm=new Alarm();

        typeCasting.triggerAlert(notification);
        typeCasting.triggerAlert(alarm);

        Software software=new Software();
        Antivirus antivirus=new Antivirus();

        typeCasting.runScan(software);
        typeCasting.runScan(antivirus);

        Armor armor=new Armor();
        Shield shield=new Shield();

        typeCasting.blockAttack(armor);
        typeCasting.blockAttack(shield);

        Author author=new Author();
        Shakespeare shakespeare=new Shakespeare();

        typeCasting.writePlay(author);
        typeCasting.writePlay(shakespeare);

        Backup backup=new Backup();
        Generator generator=new Generator();

        typeCasting.startBackup(backup);
        typeCasting.startBackup(generator);

        Carrier carrier=new Carrier();
        Basket basket=new Basket();

        typeCasting.storeGoods(carrier);
        typeCasting.storeGoods(basket);

        PowerSource powerSource=new PowerSource();
        Battery battery=new Battery();

        typeCasting.chargeDevice(powerSource);
        typeCasting.chargeDevice(battery);

        Composer composer=new Composer();
        Beethoven beethoven=new Beethoven();

        typeCasting.playSymphony(composer);
        typeCasting.playSymphony(beethoven);



    }
}
