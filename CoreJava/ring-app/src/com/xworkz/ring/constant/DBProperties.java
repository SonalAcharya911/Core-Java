package com.xworkz.ring.constant;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/weather"),
    USER_NAME("root"),
    SECRET("Sonal@7715"),
    DRIVER("com.mysql.cj.jdbc.Driver");

    private String prop;

    private DBProperties(String prop){
        this.prop=prop;
    }
    private DBProperties(){

    }

    public String getProp() {
        return prop;
    }
}
