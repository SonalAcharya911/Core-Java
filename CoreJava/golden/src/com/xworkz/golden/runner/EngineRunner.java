package com.xworkz.golden.runner;

import com.xworkz.golden.external.Car;
import com.xworkz.golden.external.DieselEngine;
import com.xworkz.golden.external.ElectricalEngine;
import com.xworkz.golden.internal.Engine;

public class EngineRunner {
    public static void main(String[] args) {
        Engine engine=new DieselEngine();
        Engine engine1=new ElectricalEngine();

        Car car=new Car(engine);
        car.ride();
    }

}
