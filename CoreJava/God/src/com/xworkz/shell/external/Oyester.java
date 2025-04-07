package com.xworkz.shell.external;

import com.xworkz.shell.internal.Shell;

public class Oyester  {
    public Oyester(){
        System.out.println("no-arg constructor in Oyester ");
    }

    public void lives(){
        System.out.println("running lives in Oyester");
        Shell shell=new Shell();
        shell.cover();
    }

}
