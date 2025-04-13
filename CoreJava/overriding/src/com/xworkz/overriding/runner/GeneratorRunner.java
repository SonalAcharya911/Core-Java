package com.xworkz.overriding.runner;

import com.xworkz.overriding.external.Generator;
import com.xworkz.overriding.external.Inverter;

public class GeneratorRunner {
    public static void main(String[] args) {
        Generator generator=new Generator();
        generator.generate();

        Generator generator1=new Inverter();
        generator1.generate();
        Inverter inverter=new Inverter();
        inverter.generate();

        Inverter inverter1=(Inverter) generator1;
        inverter1.backup();
    }
}
