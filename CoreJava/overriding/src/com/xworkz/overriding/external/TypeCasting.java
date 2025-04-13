package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.Actor;
import com.xworkz.overriding.internal.ShahRukhKhan;

public class TypeCasting {
    public TypeCasting(){
        System.out.println("no-arg constructor for TypeCasting");
    }
    public void increaseFans(Actor actor){
        if(actor!=null){
            actor.act();
            if(actor instanceof ShahRukhKhan){
                ((ShahRukhKhan) actor).smile();
                ShahRukhKhan shahRukhKhan=(ShahRukhKhan) actor;
                shahRukhKhan.act();
                shahRukhKhan.smile();

            }
        }
        else {
            System.out.println("actor is null");
        }
    }
}
