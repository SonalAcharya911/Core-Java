public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem solarSystem1=new SolarSystem("Milky Way");
        solarSystem1.info();

        SolarSystem solarSystem2=new SolarSystem(8,290);
        solarSystem2.info();

        SolarSystem solarSystem3=new SolarSystem("Milky Way","Jupiter","Mercury");
        solarSystem3.info();

        SolarSystem solarSystem4=new SolarSystem("Earth",143000000,12470);
        solarSystem4.info();

        SolarSystem solarSystem5=new SolarSystem("Earth",365,24,true);
        solarSystem5.info();
    }

}
