package com.xworkz.golden.external;

import com.xworkz.golden.internal.Camera;

public class Photographer {
    private Camera camera;

    public Photographer(Camera camera){
        this.camera=camera;
    }

    public void use(){
        System.out.println("running use in Photographer");
        if(this.camera!=null){
            this.camera.takePic();
        }
        else {
            System.out.println("camera is null");
        }
    }
}
