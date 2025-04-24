package com.xworkz.golden.external;

import com.xworkz.golden.internal.Engine;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("running start in DieselEngine");
    }
}
