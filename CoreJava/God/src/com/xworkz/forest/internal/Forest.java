package com.xworkz.forest.internal;

public class Forest {
    public Forest(){
        System.out.println("no-arg constructor in Forest");
    }

    public void plants(){
        System.out.println("running plants in Forest");
        deforestation();
        afforestation();

    }

    void afforestation(){
        System.out.println("running afforestation in Forest");
    }

    private void deforestation(){
        System.out.println("running deforestation in Forest");
    }
}
