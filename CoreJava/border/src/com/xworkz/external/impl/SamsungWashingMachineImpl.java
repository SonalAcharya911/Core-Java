package com.xworkz.external.impl;

import com.xworkz.internal.rule.WashingMachine;

public class SamsungWashingMachineImpl implements WashingMachine {

    @Override
    public void turnOn() {
        System.out.println("running turnOn in SamsungWashingMachineImpl ");
    }

    @Override
    public void turnOff() {
        System.out.println("running turnOff in SamsungWashingMachineImpl ");
    }

    @Override
    public void fillWater() {
        System.out.println("running fillWater in SamsungWashingMachineImpl ");
    }

    @Override
    public void startWash() {
        System.out.println("running starWash in SamsungWashingMachineImpl ");
    }

    @Override
    public void rinse() {
        System.out.println("running rinse in SamsungWashingMachineImpl ");
    }

    @Override
    public void spin() {
        System.out.println("running spin in SamsungWashingMachineImpl ");
    }

    @Override
    public void drainWater() {
        System.out.println("running drainWater in SamsungWashingMachineImpl ");
    }

    @Override
    public void setTimer() {
        System.out.println("running setTimer in SamsungWashingMachineImpl ");
    }

    @Override
    public void cleanDrum() {
        System.out.println("running cleanDrum in SamsungWashingMachineImpl ");
    }
}
