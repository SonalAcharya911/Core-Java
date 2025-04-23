package com.xworkz.external.impl;

import com.xworkz.internal.rule.Box;

public class TiffinBoxImpl implements Box {
    @Override
    public void open() {
        System.out.println("running open in TiffinBoxImpl");
    }
}
