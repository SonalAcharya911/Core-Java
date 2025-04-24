package com.xworkz.golden.external;

import com.xworkz.golden.internal.Camera;

public class PhoneCamera implements Camera {
    @Override
    public void takePic() {
        System.out.println("running takePic in PhoneCamera");
    }
}
