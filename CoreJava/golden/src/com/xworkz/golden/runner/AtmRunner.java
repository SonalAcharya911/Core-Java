package com.xworkz.golden.runner;

import com.xworkz.golden.external.HdfcAtm;
import com.xworkz.golden.external.SbiAtm;
import com.xworkz.golden.external.User;
import com.xworkz.golden.internal.Atm;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm=new SbiAtm();
        Atm atm1=new HdfcAtm();

        atm.drawMoney();
        atm1.drawMoney();

        User user=new User(atm);
        user.depositMoney();
    }
}
