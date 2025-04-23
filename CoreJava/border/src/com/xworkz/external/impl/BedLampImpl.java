package com.xworkz.external.impl;

import com.xworkz.internal.rule.Lamp;

public class BedLampImpl implements Lamp {
    @Override
    public void light() {
        System.out.println("running light in BedlampImpl");
    }
}
