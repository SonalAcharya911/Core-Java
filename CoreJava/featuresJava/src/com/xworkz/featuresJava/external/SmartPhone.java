package com.xworkz.featuresJava.external;

import com.xworkz.featuresJava.internal.SmartDevice;

public class SmartPhone implements SmartDevice {

        public void powerOn() { System.out.println("Smartphone powered on"); }
        public void powerOff() { System.out.println("Smartphone powered off"); }
        public void connectToWiFi(String network) { System.out.println("Connected to " + network); }
        public void playMusic(String song) { System.out.println("Playing song: " + song); }
        public void takePicture() { System.out.println("Picture taken"); }
        public void browseInternet() { System.out.println("Browsing the internet..."); }
        public void increaseVolume() { System.out.println("Volume increased"); }
        public void decreaseVolume() { System.out.println("Volume decreased"); }
        public void installApp(String appName) { System.out.println(appName + " installed"); }
        public void uninstallApp(String appName) { System.out.println(appName + " uninstalled"); }

}
