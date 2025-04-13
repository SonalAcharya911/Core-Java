package com.xworkz.overriding.runner;

import com.xworkz.overriding.external.TypeCasting;
import com.xworkz.overriding.internal.Actor;
import com.xworkz.overriding.internal.Actress;
import com.xworkz.overriding.internal.Deepika;
import com.xworkz.overriding.internal.ShahRukhKhan;

public class TypeCastRunner {
    public static void main(String[] args) {
        TypeCasting typeCasting=new TypeCasting();


        Actor actor =new Actor();
        ShahRukhKhan shahRukhKhan=new ShahRukhKhan();

        typeCasting.increaseFans(actor);
        typeCasting.increaseFans(shahRukhKhan);

        Actress actress=new Actress();
        Deepika deepika=new Deepika();




    }
}
