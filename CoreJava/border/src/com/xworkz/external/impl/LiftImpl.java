package com.xworkz.external.impl;

import com.xworkz.internal.rule.Elevator;

public class LiftImpl implements Elevator {
    @Override
    public void openDoor() {
        System.out.println("running openDoor in LiftImpl");
    }

    @Override
    public void closeDoor() {
        System.out.println("running closeDoor in LiftImpl");
    }

    @Override
    public void goUp() {
        System.out.println("running goUp in LiftImpl");
    }

    @Override
    public void goDown() {
        System.out.println("running goDown in LiftImpl");
    }

    @Override
    public void emergencyStop() {
        System.out.println("running emergencyStop in LiftImpl");
    }

    @Override
    public void displayFloor() {
        System.out.println("running displayFloor in LiftImpl");
    }

    @Override
    public void ringBell() {
        System.out.println("running ringBell in LiftImpl");
    }
}
