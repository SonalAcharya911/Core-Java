package com.xworkz.property;

public class PropertyRunner {
    public static void main(String[] args) {
        Property property1=new Property(120,"Kaggadasapura");
        Property property2=new Property(240,"Brookefield");

        Property[] property={property1,property2};

        Owner owner=new Owner("Sonal",21,property);
        owner.show();

        Owner owner1=new Owner("Saahil",18,property);
        owner1.show();
    }

}
