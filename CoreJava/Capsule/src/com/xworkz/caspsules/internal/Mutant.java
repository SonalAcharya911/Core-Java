package com.xworkz.caspsules.internal;

public class Mutant {
    private String name="Wolverine";
    private String power="Regenerative Powers";
    private String weakness="Adamantium";
    private int age=200;
    private String weapon="Claws";

    public Mutant(){
        System.out.println("no-arg constructor for Mutant");
    }
    void setName(String name) {
        this.name = name;
    }
    void setPower(String power){
        this.power=power;
    }

    void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }
}
