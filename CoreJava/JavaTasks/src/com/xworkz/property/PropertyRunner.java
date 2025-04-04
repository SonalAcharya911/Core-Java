package com.xworkz.property;

public class PropertyRunner {
    public static void main(String[] args) {
        Property property1=new Property(120,"Kaggadasapura");
        Property property2=new Property(240,"Brookefield");

        Property[] property={property1,property1};

        Owner owner=new Owner("Sonal",21,property);
        owner.show();
    }

}
