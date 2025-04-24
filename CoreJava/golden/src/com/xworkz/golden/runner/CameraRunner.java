package com.xworkz.golden.runner;

import com.xworkz.golden.external.DSLRCam;
import com.xworkz.golden.external.PhoneCamera;
import com.xworkz.golden.external.Photographer;
import com.xworkz.golden.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera=new PhoneCamera();
        Camera camera1=new DSLRCam();

        Photographer photographer=new Photographer(camera);
        photographer.use();
    }
}
