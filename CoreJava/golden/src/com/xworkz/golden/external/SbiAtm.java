package com.xworkz.golden.external;

import com.xworkz.golden.internal.Atm;

public class SbiAtm implements Atm {

    @Override
    public void drawMoney() {
        System.out.println("running drawMoney in SbiAtm");
    }
}
