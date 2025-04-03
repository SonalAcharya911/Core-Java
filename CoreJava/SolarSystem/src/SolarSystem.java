public class SolarSystem {
    String galaxyName;
    int noOfPlanets;
    int noOfMoons;
    String largestPlanet;
    String smallestPlanet;
    int planetDiameter;
    int planetDistance;
    int revolutionTime;
    int rotationTime;
    String planetName;
    boolean atmosphere;

    SolarSystem(String galaxyName){
        System.out.println("running String constructor in SolarSystem");
        this.galaxyName=galaxyName;
    }

    SolarSystem(int noOfPlanets,int noOfMoons){
        System.out.println("running int,int constructor in SolarSystem");
        this.noOfPlanets=noOfPlanets;
        this.noOfMoons=noOfMoons;
    }

    SolarSystem(String galaxyName,String largestPlanet,String smallestPlanet){
        System.out.println("running String,String,String constructor in SolarSystem");
        this.galaxyName=galaxyName;
        this.largestPlanet=largestPlanet;
        this.smallestPlanet=smallestPlanet;
    }
    SolarSystem(String planetName,int planetDiameter,int planetDistance){
        System.out.println("running String,int,int constructor in solarSystem");
        this.planetName=planetName;
        this.planetDiameter=planetDiameter;
        this.planetDistance=planetDistance;
    }

    SolarSystem(String planetName, int revolutionTime,int rotationTime,boolean atmosphere){
        System.out.println("running String,int,int,boolean constructor in SolarSystem");
        this.planetName=planetName;
        this.revolutionTime=revolutionTime;
        this.rotationTime=rotationTime;
        this.atmosphere=atmosphere;
    }

    public void info(){
        System.out.println("running info method in SolarSystem");
        System.out.println("Galaxy name: "+this.galaxyName);
        System.out.println("No of Planets: "+this.noOfPlanets);
        System.out.println("No of moons: "+this.noOfMoons);
        System.out.println("Largest planet: "+this.largestPlanet);
        System.out.println("smallest planet: "+this.smallestPlanet);
        System.out.println("planet diameter: "+this.planetDiameter);
        System.out.println("planet distance from sun: "+this.planetDistance);
        System.out.println("revolution time: "+this.revolutionTime);
        System.out.println("rotation time: "+this.rotationTime);
        System.out.println("planet name: "+this.planetName);
        System.out.println("Atmosphere: "+this.atmosphere);

    }

}
