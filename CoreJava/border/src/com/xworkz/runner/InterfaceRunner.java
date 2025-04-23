package com.xworkz.runner;

import com.xworkz.external.impl.LGAirConditionerImpl;
import com.xworkz.external.impl.UnionBankATMImpl;
import com.xworkz.internal.rule.ATM;
import com.xworkz.internal.rule.AirConditioner;

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
    }
}
