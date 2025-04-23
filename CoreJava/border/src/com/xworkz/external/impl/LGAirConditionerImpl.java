package com.xworkz.external.impl;

import com.xworkz.internal.rule.AirConditioner;

public class LGAirConditionerImpl implements AirConditioner {

    @Override
    public void turnOn() {
        System.out.println("running turnOn in LGAirConditionerImpl");
    }

    @Override
    public void turnOff() {
        System.out.println("running turnOff in LGAirConditionerImpl");
    }

    @Override
    public void increaseTemperature() {
        System.out.println("running increaseTemperature in LGAirConditionerImpl");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("running decreaseTemperature in LGAirConditionerImpl");
    }

    @Override
    public void setTimer() {
        System.out.println("running setTimer in LGAirConditionerImpl");
    }

    @Override
    public void switchMode() {
        System.out.println("running switchMode in LGAirConditionerImpl");
    }

    @Override
    public void cleanFilter() {
        System.out.println("running cleanFilter in LGAirConditionerImpl");
    }
}
