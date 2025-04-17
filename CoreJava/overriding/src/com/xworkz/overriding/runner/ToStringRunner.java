package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.*;

public class ToStringRunner {
    public static void main(String[] args) {
        Actor actor=new Actor("Swadesh",100);
        System.out.println(actor);

        Actress actress=new Actress("Indian",20);
        System.out.println(actress);

        Agent agent=new Agent("palmtree",25);
        System.out.println(agent);

        Armor armor=new Armor("iron","grey");
        System.out.println(armor);

        Author author=new Author(5,10);
        System.out.println(author);

        Notification notification = new Notification();
        notification.setMessage("wake up");
        notification.setType("Reminder");
        System.out.println(notification);

        Software software = new Software();
        software.setName("IntelliJ");
        software.setVersion("1.8");
        System.out.println(software);

        Backup backup = new Backup("Diesel Generator", 100);
        System.out.println(backup);

        Carrier carrier = new Carrier("Fruit Basket", 20);
        System.out.println(carrier);

        PowerSource powersource = new PowerSource();
        powersource.setType("generator");
        powersource.setCapacity(240.80);
        System.out.println(powersource);

        Composer composer = new Composer("Symphony", 1808);
        System.out.println(composer);

        Berry berry = new Berry("Strawberry", "Red");
        System.out.println(berry);

        Blanket blanket = new Blanket("Double","Cotton");
        System.out.println(blanket);

        Notebook notebook = new Notebook(100,"hardbind");
        System.out.println(notebook);

        Brand brand = new Brand("Honda", 1000000);
        System.out.println(brand);

        Brush brush = new Brush("OralB Toothbrush", "Soft");
        System.out.println(brush);

        Train train = new Train();
        train.setCoaches(100);
        train.setRoute("via Kottayam");
        System.out.println(train);

        Trap trap = new Trap();
        trap.setMaterial("iron");
        trap.setPurpose("catch animal");
        System.out.println(trap);

        Room room = new Room();
        room.setType("Living");
        room.setArea(800.20);
        System.out.println(room);

        Dessert dessert = new Dessert("Chocolate Cake", 100);
        System.out.println(dessert);

        Desert desert = new Desert("Sahara", 9200000);
        System.out.println(desert);

        Camera camera = new Camera("Canon DSLR", 24);
        System.out.println(camera);

        Vegetable vegetable = new Vegetable();
        vegetable.setName("Carrot");
        vegetable.setColor("Orange");
        System.out.println(vegetable);

        Card card = new Card("Visa Credit Card", 123456);
        System.out.println(card);

        Sport sport = new Sport();
        sport.setType("outdoor");
        sport.setName("Cricket");
        System.out.println(sport);

        Gym gym = new Gym("CultFit", 20);
        System.out.println(gym);

        Doctor doctor = new Doctor("Cardiologist", 15);
        System.out.println(doctor);

        Cleanser cleanser = new Cleanser("FaceWash", 100);
        System.out.println(cleanser);

        Color color = new Color("Yellow", "#FFFF00");
        System.out.println(color);

        Witch witch = new Witch();
        witch.setName("Wanda Maximoff");
        witch.setPower("Chaos Magic");
        System.out.println(witch);

        Wizard wizard = new Wizard();
        wizard.setName("Doctor Strange");
        wizard.setSpecialty("Time Manipulation");
        System.out.println(wizard);

        Fabric fabric = new Fabric(20, "Blue");
        System.out.println(fabric);

        Herbivore herbivore = new Herbivore("Cow", "Grass");
        System.out.println(herbivore);







    }
}
