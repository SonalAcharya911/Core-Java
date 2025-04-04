package com.xworkz.village;

public class VillageRunner {
    public static void main(String[] args) {
        Village village1=new Village("Kottayam","Kerala","India",677093);
        Village village2=new Village("Pandalam","Kerala","India",677863);

        Village[] village= {village1,village2};

        Citizen citizen=new Citizen("Sharada",55,village);

        citizen.displayDetails();
    }
}
