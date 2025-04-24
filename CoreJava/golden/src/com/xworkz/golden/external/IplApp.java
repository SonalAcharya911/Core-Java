package com.xworkz.golden.external;

import com.xworkz.golden.internal.JDBC;

public class IplApp {
    private JDBC jdbc;

    public IplApp(JDBC jdbc){
        this.jdbc=jdbc;
    }

    public void saveTeamInfo(){
        System.out.println("running saveTeamInfo in IplApp");
        if(this.jdbc!=null){
            this.jdbc.save();
        }
        else{
            System.out.println("jdbc is null");
        }
    }
}
