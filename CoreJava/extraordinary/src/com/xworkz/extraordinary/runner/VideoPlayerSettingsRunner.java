package com.xworkz.extraordinary.runner;

public class VideoPlayerSettingsRunner {
    public static void main(String[] args) {
        try {
            boolean deviceCompatible = true;
            if (!deviceCompatible) throw new RuntimeException("Device not compatible");

            try {
                String resolution = "4K";
                if (!("720p".equals(resolution) || "1080p".equals(resolution))) {
                    throw new RuntimeException("Resolution not supported: " + resolution);
                }
                System.out.println("Resolution supported: " + resolution);
            } catch (RuntimeException e) {
                System.out.println("Inner error: " + e.getMessage());
            }

            System.out.println("Device compatible and settings applied");
        } catch (RuntimeException e) {
            System.out.println("Outer error: " + e.getMessage());
        }
    }
}
