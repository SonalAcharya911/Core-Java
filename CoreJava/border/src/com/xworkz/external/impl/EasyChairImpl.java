package com.xworkz.external.impl;

import com.xworkz.internal.rule.Chair;

public class EasyChairImpl implements Chair {
    @Override
    public void move() {
        System.out.println("running move in EasyChairImpl");
    }

    @Override
    public void sit() {
        System.out.println("running sit in EasyChairImpl");
    }

    @Override
    public void breakChair() {
        System.out.println("running breakChair in EasyChairImpl");
    }
}
