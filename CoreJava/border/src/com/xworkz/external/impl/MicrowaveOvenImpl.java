package com.xworkz.external.impl;

import com.xworkz.internal.rule.Oven;

public class MicrowaveOvenImpl implements Oven {
    @Override
    public void preheat() {
        System.out.println("running preheat in MicrowaveOvenImpl");
    }

    @Override
    public void bake() {
        System.out.println("running bake in MicrowaveOvenImpl");
    }

    @Override
    public void grill() {
        System.out.println("running grill in MicrowaveOvenImpl");
    }

    @Override
    public void stop() {
        System.out.println("running stop in MicrowaveOvenImpl");
    }

    @Override
    public void clean() {
        System.out.println("running clean in MicrowaveOvenImpl");
    }
}
