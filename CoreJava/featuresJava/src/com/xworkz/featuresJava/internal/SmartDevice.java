package com.xworkz.featuresJava.internal;

public interface SmartDevice {
        // Abstract Methods
        void powerOn();
        void powerOff();
        void connectToWiFi(String network);
        void playMusic(String song);
        void takePicture();
        void browseInternet();
        void increaseVolume();
        void decreaseVolume();
        void installApp(String appName);
        void uninstallApp(String appName);

        // Default Methods
        default void showBatteryStatus() { System.out.println("Battery at 85%"); }
        default void enableBluetooth() { System.out.println("Bluetooth enabled"); }
        default void disableBluetooth() { System.out.println("Bluetooth disabled"); }
        default void showDeviceInfo() { System.out.println("SmartDevice Info Displayed"); }
        default void enableAirplaneMode() { System.out.println("Airplane Mode On"); }
        default void disableAirplaneMode() { System.out.println("Airplane Mode Off"); }
        default void lockScreen() { System.out.println("Screen locked"); }
        default void unlockScreen() { System.out.println("Screen unlocked"); }
        default void switchTheme(String theme) { System.out.println("Switched to theme: " + theme); }
        default void enableDoNotDisturb() { System.out.println("Do Not Disturb enabled"); }

        // Static Methods
        static void resetDevice() { System.out.println("Device reset to factory settings"); }
        static void updateFirmware() { System.out.println("Firmware updated"); }
        static void checkForUpdates() { System.out.println("Checking for updates..."); }
        static void syncCloudData() { System.out.println("Cloud sync complete"); }
        static void backupData() { System.out.println("Data backed up"); }
        static void locateDevice() { System.out.println("Locating device..."); }
        static void shutdownNow() { System.out.println("Device shutting down"); }
        static void showHelp() { System.out.println("Help menu opened"); }
        static void diagnostics() { System.out.println("Running diagnostics..."); }
        static void optimizePerformance() { System.out.println("Device performance optimized"); }

}
