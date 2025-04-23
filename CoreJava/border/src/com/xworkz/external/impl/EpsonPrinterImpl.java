package com.xworkz.external.impl;

import com.xworkz.internal.rule.Printer;

public class EpsonPrinterImpl implements Printer {
    @Override
    public void print() {
        System.out.println("running print in EpsonPrinterImpl");
    }
}
