package com.xworkz.runner;

import com.xworkz.external.impl.DoorBellImpl;
import com.xworkz.external.impl.LGAirConditionerImpl;
import com.xworkz.external.impl.TiffinBoxImpl;
import com.xworkz.external.impl.UnionBankATMImpl;
import com.xworkz.internal.rule.ATM;
import com.xworkz.internal.rule.AirConditioner;
import com.xworkz.internal.rule.Bell;
import com.xworkz.internal.rule.Box;

public class InterfaceRunner {
    public static void main(String[] args) {
        AirConditioner airConditioner=new LGAirConditionerImpl();
        LGAirConditionerImpl lgAirConditioner=new LGAirConditionerImpl();

        airConditioner.cleanFilter();
        airConditioner.decreaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.setTimer();
        airConditioner.turnOff();
        airConditioner.turnOn();
        airConditioner.switchMode();

        lgAirConditioner.cleanFilter();
        lgAirConditioner.decreaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.setTimer();
        lgAirConditioner.turnOff();
        lgAirConditioner.turnOn();
        lgAirConditioner.switchMode();

        System.out.println("==========================");

        ATM  atm=new UnionBankATMImpl();
        UnionBankATMImpl unionBankATM=new UnionBankATMImpl();

        atm.checkBalance();
        atm.depositCash();
        atm.ejectCard();
        atm.enterPin();
        atm.printReceipt();
        atm.withdrawCash();
        atm.insertCard();

        unionBankATM.checkBalance();
        unionBankATM.printReceipt();
        unionBankATM.depositCash();
        unionBankATM.ejectCard();
        unionBankATM.enterPin();
        unionBankATM.withdrawCash();
        unionBankATM.insertCard();

        System.out.println("==========================");

        Bell bell=new DoorBellImpl();
        DoorBellImpl doorBell=new DoorBellImpl();

        bell.ring();
        doorBell.ring();

        System.out.println("==========================");

        Box box=new TiffinBoxImpl();
        TiffinBoxImpl tiffinBox=new TiffinBoxImpl();

        box.open();
        tiffinBox.open();



    }
}
