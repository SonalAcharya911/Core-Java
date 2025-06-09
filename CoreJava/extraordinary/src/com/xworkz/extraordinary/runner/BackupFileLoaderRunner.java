package com.xworkz.extraordinary.runner;

import java.io.IOException;

public class BackupFileLoaderRunner {
    public static void main(String[] args) {
        try {
            loadConfig("main-config.txt");
        } catch (IOException e) {
            System.out.println("Main config failed: " + e.getMessage());
            try {
                loadConfig("backup-config.txt");
            } catch (IOException ex) {
                System.out.println("Backup config also failed: " + ex.getMessage());
            }
        }
    }

    static void loadConfig(String filename) throws IOException {
        System.out.println("Loading config from " + filename);
        if (filename.equals("main-config.txt")) {
            throw new IOException("File not found: " + filename);
        }
        System.out.println("Config loaded successfully from " + filename);
    }
}
