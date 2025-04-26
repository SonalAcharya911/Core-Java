package com.xworkz.runner;

import com.xworkz.external.impl.*;
import com.xworkz.internal.rule.*;

public class InterfaceRunner {
    public static void main(String[] args) {
        AirConditioner airConditioner = new LGAirConditionerImpl();
        LGAirConditionerImpl lgAirConditioner = new LGAirConditionerImpl();

        airConditioner.cleanFilter();
        airConditioner.decreaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.setTimer();
        airConditioner.turnOff();
        airConditioner.turnOn();
        airConditioner.switchMode();

        lgAirConditioner.cleanFilter();
        lgAirConditioner.decreaseTemperature();
        lgAirConditioner.increaseTemperature();
        lgAirConditioner.setTimer();
        lgAirConditioner.turnOff();
        lgAirConditioner.turnOn();
        lgAirConditioner.switchMode();

        System.out.println("==========================");

        ATM atm = new UnionBankATMImpl();
        UnionBankATMImpl unionBankATM = new UnionBankATMImpl();

        atm.checkBalance();
        atm.depositCash();
        atm.ejectCard();
        atm.enterPin();
        atm.printReceipt();
        atm.withdrawCash();
        atm.insertCard();

        unionBankATM.checkBalance();
        unionBankATM.printReceipt();
        unionBankATM.depositCash();
        unionBankATM.ejectCard();
        unionBankATM.enterPin();
        unionBankATM.withdrawCash();
        unionBankATM.insertCard();

        System.out.println("==========================");

        Bell bell = new DoorBellImpl();
        DoorBellImpl doorBell = new DoorBellImpl();

        bell.ring();
        doorBell.ring();

        System.out.println("==========================");

        Box box = new TiffinBoxImpl();
        TiffinBoxImpl tiffinBox = new TiffinBoxImpl();

        box.open();
        tiffinBox.open();

        System.out.println("==========================");

        Car car = new HondaCarImpl();
        HondaCarImpl hondaCar = new HondaCarImpl();

        car.accelerate();
        car.stop();
        car.start();

        hondaCar.accelerate();
        hondaCar.start();
        hondaCar.stop();

        System.out.println("==========================");

        Chair chair = new EasyChairImpl();
        EasyChairImpl easyChair = new EasyChairImpl();

        chair.breakChair();
        chair.sit();
        chair.move();

        easyChair.breakChair();
        easyChair.move();
        easyChair.sit();

        System.out.println("==========================");

        Computer computer = new LaptopImpl();
        LaptopImpl laptop = new LaptopImpl();

        computer.restart();
        computer.start();
        computer.shutDown();

        laptop.restart();
        laptop.shutDown();
        laptop.start();

        System.out.println("==========================");

        Door door = new HouseDoorImpl();
        HouseDoorImpl houseDoor = new HouseDoorImpl();

        door.close();
        door.open();
        door.knock();

        houseDoor.close();
        houseDoor.knock();
        houseDoor.open();

        System.out.println("==========================");

        Drone drone = new SecurityDroneImpl();
        SecurityDroneImpl securityDrone = new SecurityDroneImpl();

        drone.flyBackward();
        drone.land();
        drone.flyForward();
        drone.powerOn();
        drone.takeOff();
        drone.recordVideo();
        drone.takePhoto();
        drone.turnLeft();
        drone.turnRight();

        securityDrone.flyBackward();
        securityDrone.flyForward();
        securityDrone.land();
        securityDrone.powerOn();
        securityDrone.recordVideo();
        securityDrone.takePhoto();
        securityDrone.turnLeft();
        securityDrone.turnRight();
        securityDrone.takeOff();

        System.out.println("==========================");

        Elevator elevator = new LiftImpl();
        LiftImpl lift = new LiftImpl();

        elevator.closeDoor();
        elevator.displayFloor();
        elevator.emergencyStop();
        elevator.goUp();
        elevator.openDoor();
        elevator.goDown();
        elevator.ringBell();

        lift.closeDoor();
        lift.displayFloor();
        lift.goUp();
        lift.emergencyStop();
        lift.goDown();
        lift.ringBell();
        lift.openDoor();

        System.out.println("==========================");

        ExamCenter examCenter=new BoardExamImpl();
        BoardExamImpl boardExam=new BoardExamImpl();

        examCenter.writeExam();
        boardExam.writeExam();

        System.out.println("==========================");

        HeadPhone headPhone=new AirpodsImpl();
        AirpodsImpl airpods=new AirpodsImpl();

        headPhone.connectBluetooth();
        headPhone.decreaseVolume();
        headPhone.powerOn();
        headPhone.play();
        headPhone.pause();
        headPhone.increaseVolume();
        headPhone.powerOff();

        airpods.connectBluetooth();
        airpods.decreaseVolume();
        airpods.powerOff();
        airpods.powerOn();
        airpods.play();
        airpods.increaseVolume();
        airpods.pause();

        System.out.println("==========================");

        Lamp lamp=new BedLampImpl();
        BedLampImpl bedLamp=new BedLampImpl();

        lamp.light();
        bedLamp.light();

        System.out.println("==========================");

        Light light=new TubeLightImpl();
        TubeLightImpl tubeLight=new TubeLightImpl();

        light.bend();
        light.turnOff();
        light.turnOn();

        tubeLight.bend();
        tubeLight.turnOff();
        tubeLight.turnOn();

        System.out.println("==========================");

        Mobile mobile=new RealmeImpl();
        RealmeImpl realme=new RealmeImpl();

        mobile.browse();
        mobile.call();
        mobile.message();
        mobile.turnOff();
        mobile.turnOn();

        realme.browse();
        realme.call();
        realme.message();
        realme.turnOff();
        realme.turnOn();

        System.out.println("==========================");

        Oven oven=new MicrowaveOvenImpl();
        MicrowaveOvenImpl microwaveOven=new MicrowaveOvenImpl();

        oven.bake();
        oven.clean();
        oven.grill();
        oven.stop();
        oven.preheat();

        microwaveOven.bake();
        microwaveOven.grill();
        microwaveOven.clean();
        microwaveOven.stop();
        microwaveOven.preheat();

        System.out.println("==========================");

        Printer printer=new EpsonPrinterImpl();
        EpsonPrinterImpl epsonPrinter=new EpsonPrinterImpl();

        printer.print();
        epsonPrinter.print();

        System.out.println("==========================");

        Radio radio=new RedFMImpl();
        RedFMImpl redFM=new RedFMImpl();

        radio.decreaseVolume();
        radio.increaseVolume();
        radio.tuneFrequency();
        radio.turnOff();
        radio.turnOn();

        redFM.decreaseVolume();
        redFM.increaseVolume();
        redFM.tuneFrequency();
        redFM.turnOff();
        redFM.turnOn();

        System.out.println("==========================");

        Temple temple=new JagannathTempleImpl();
        JagannathTempleImpl jagannathTemple=new JagannathTempleImpl();

        temple.dontTakePics();
        temple.dontUsePhone();
        temple.offerFlowers();
        temple.removeSlippers();
        temple.tieHairs();

        jagannathTemple.dontTakePics();
        jagannathTemple.tieHairs();
        jagannathTemple.dontUsePhone();
        jagannathTemple.offerFlowers();
        jagannathTemple.removeSlippers();

        System.out.println("==========================");

        Video video=new MovieImpl();
        MovieImpl movie=new MovieImpl();

        video.increaseSpeed();
        video.play();
        video.pause();
        video.stop();
        video.record();

        movie.increaseSpeed();
        movie.pause();
        movie.play();
        movie.stop();
        movie.record();

        System.out.println("==========================");

        WashingMachine washingMachine=new SamsungWashingMachineImpl();
        SamsungWashingMachineImpl samsungWashingMachine=new SamsungWashingMachineImpl();

        washingMachine.cleanDrum();
        washingMachine.startWash();
        washingMachine.turnOn();
        washingMachine.drainWater();
        washingMachine.rinse();
        washingMachine.fillWater();
        washingMachine.setTimer();
        washingMachine.spin();
        washingMachine.turnOff();

        samsungWashingMachine.cleanDrum();
        samsungWashingMachine.startWash();
        samsungWashingMachine.turnOn();
        samsungWashingMachine.rinse();
        samsungWashingMachine.drainWater();
        samsungWashingMachine.fillWater();
        samsungWashingMachine.setTimer();
        samsungWashingMachine.spin();
        samsungWashingMachine.turnOff();

        System.out.println("==========================");

        Window window=new RoomWindowImpl();
        RoomWindowImpl roomWindow=new RoomWindowImpl();

        window.clean();
        window.close();
        window.dontBreakGlass();
        window.open();
        window.lock();
        window.slide();
        window.unlock();

        roomWindow.clean();
        roomWindow.close();
        roomWindow.lock();
        roomWindow.open();
        roomWindow.slide();
        roomWindow.dontBreakGlass();
        roomWindow.unlock();
    }
}
