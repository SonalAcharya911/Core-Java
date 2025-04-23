package com.xworkz.external.impl;

import com.xworkz.internal.rule.Temple;

public class JagannathTempleImpl implements Temple {
    @Override
    public void removeSlippers() {
        System.out.println("running removeSlippers in JagannathTempleImpl");
    }

    @Override
    public void dontUsePhone() {
        System.out.println("running dontUsePhone in JagannathTempleImpl");
    }

    @Override
    public void dontTakePics() {
        System.out.println("running dontTakePics in JagannathTempleImpl");
    }

    @Override
    public void tieHairs() {
        System.out.println("running tieHairs in JagannathTempleImpl");
    }

    @Override
    public void offerFlowers() {
        System.out.println("running offerFlowers in JagannathTempleImpl");
    }
}
