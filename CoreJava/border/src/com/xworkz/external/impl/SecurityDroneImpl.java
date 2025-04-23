package com.xworkz.external.impl;

import com.xworkz.internal.rule.Drone;

public class SecurityDroneImpl implements Drone {
    @Override
    public void powerOn() {
        System.out.println("running powerOn in SecurityDroneImpl");
    }

    @Override
    public void takeOff() {
        System.out.println("running takeOff in SecurityDroneImpl");
    }

    @Override
    public void land() {
        System.out.println("running land in SecurityDroneImpl");
    }

    @Override
    public void flyForward() {
        System.out.println("running flyForward in SecurityDroneImpl");
    }

    @Override
    public void flyBackward() {
        System.out.println("running flyBackward in SecurityDroneImpl");
    }

    @Override
    public void turnLeft() {
        System.out.println("running turnLeft in SecurityDroneImpl");
    }

    @Override
    public void turnRight() {
        System.out.println("running turnRight in SecurityDroneImpl");
    }

    @Override
    public void takePhoto() {
        System.out.println("running takePhoto in SecurityDroneImpl");
    }

    @Override
    public void recordVideo() {
        System.out.println("running recordVideo in SecurityDroneImpl");
    }
}
