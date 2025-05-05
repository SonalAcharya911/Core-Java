package com.xworkz.featuresJava.runner;

import com.xworkz.featuresJava.external.SmartPhone;
import com.xworkz.featuresJava.internal.SmartDevice;

public class SmartRunner {
    public static void main(String[] args) {
        SmartDevice smartDevice=new SmartPhone();

        smartDevice.powerOn();
        smartDevice.connectToWiFi("Home_WiFi");
        smartDevice.playMusic("Imagine Dragons");
        smartDevice.takePicture();
        smartDevice.browseInternet();
        smartDevice.increaseVolume();
        smartDevice.decreaseVolume();
        smartDevice.installApp("WhatsApp");
        smartDevice.uninstallApp("Facebook");
        smartDevice.powerOff();

        smartDevice.showBatteryStatus();
        smartDevice.enableBluetooth();
        smartDevice.disableBluetooth();
        smartDevice.showDeviceInfo();
        smartDevice.enableAirplaneMode();
        smartDevice.disableAirplaneMode();
        smartDevice.lockScreen();
        smartDevice.unlockScreen();
        smartDevice.switchTheme("Dark");
        smartDevice.enableDoNotDisturb();

        SmartDevice.resetDevice();
        SmartDevice.updateFirmware();
        SmartDevice.checkForUpdates();
        SmartDevice.syncCloudData();
        SmartDevice.backupData();
        SmartDevice.locateDevice();
        SmartDevice.shutdownNow();
        SmartDevice.showHelp();
        SmartDevice.diagnostics();
        SmartDevice.optimizePerformance();


        SmartDevice device = new SmartDevice() {

            public void powerOn() {
                System.out.println("Anonymous device powered on");
            }
            public void powerOff() {
                System.out.println("Anonymous device powered off");
            }
            public void connectToWiFi(String network) {
                System.out.println("Connected to " + network);
            }
            public void playMusic(String song) { System.out.println("Playing song: " + song); }
            public void takePicture() { System.out.println("Captured a photo"); }
            public void browseInternet() { System.out.println("Browsing..."); }
            public void increaseVolume() { System.out.println("Vol +"); }
            public void decreaseVolume() { System.out.println("Vol -"); }
            public void installApp(String appName) { System.out.println("App " + appName + " installed"); }
            public void uninstallApp(String appName) { System.out.println("App " + appName + " removed"); }
        };

        device.powerOn();
        device.connectToWiFi("Office_WiFi");
        device.playMusic("Shape of You");
        device.takePicture();
        device.browseInternet();
        device.increaseVolume();
        device.decreaseVolume();
        device.installApp("Zoom");
        device.uninstallApp("Snapchat");
        device.powerOff();
    }
}
