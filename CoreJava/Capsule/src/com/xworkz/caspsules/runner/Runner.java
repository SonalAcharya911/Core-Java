package com.xworkz.caspsules.runner;

import com.xworkz.caspsules.external.Army;
import com.xworkz.caspsules.external.Fans;
import com.xworkz.caspsules.external.Key;
import com.xworkz.caspsules.external.Student;
import com.xworkz.caspsules.internal.Officer;
import com.xworkz.caspsules.internal.Xmen;
import com.xworkz.caspsules.internal.*;



public class Runner {
    public static void main(String[] args) {
        Xmen xmen=new Xmen();
        xmen.save();
        System.out.println("=========================");

        Fans fans=new Fans();
        fans.watch();
        System.out.println("=========================");

        Holder holder=new Holder();
        holder.keep();
        System.out.println("=========================");

        Key key=new Key();
        key.unlock();
        System.out.println("=========================");

        Army army=new Army();
        army.deploy();
        System.out.println("=========================");
        Commander commander=new Commander();
        commander.operate();
        System.out.println("=========================");

        Student student=new Student();
        student.earn();
        System.out.println("=========================");

        Officer officer=new Officer();
        officer.wears();
        System.out.println("=========================");












    }
}
