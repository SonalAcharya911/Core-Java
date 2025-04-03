public class Airlines {
    String name;
    String flightNo;
    String source;
    String destination;
    String arrivalTime;
    String deptTime;
    double ticketPrice;
    boolean isDelayed;
    int terminal;
    String pilotName;

    Airlines(String name) {
        System.out.println("running constructor with 1 parameter");
        this.name = name;
    }

    Airlines(String name,String flightNo,double ticketPrice,String pilotName){
        System.out.println("running constructor with String,String,double parameters");
        this.name=name;
        this.flightNo=flightNo;
        this.ticketPrice=ticketPrice;
        this.pilotName=pilotName;
    }

    Airlines(String source, String destination){
        System.out.println("running constructor with src dest parameters");
        this.source=source;
        this.destination=destination;
    }

    Airlines(String arrivalTime,String deptTime,boolean isDelayed){
        System.out.println("running constructor with String,String,boolean parameters");
        this.arrivalTime=arrivalTime;
        this.deptTime=deptTime;
        this.isDelayed=isDelayed;
    }

    Airlines(int terminal,String destination,String deptTime){
        System.out.println("running constructor with int,String,String parameters");
        this.terminal=terminal;
        this.destination=destination;
        this.deptTime=deptTime;
    }

    public void printInfo(){
        System.out.println("running ifo class in Airlines");
        System.out.println("Airlines name: "+this.name);
        System.out.println("Airlines flightNo: "+this.flightNo);
        System.out.println("Airlines source: "+this.source);
        System.out.println("Airlines destination: "+this.destination);
        System.out.println("Airlines arrivalTime: "+this.arrivalTime);
        System.out.println("Airlines deptTime: "+this.deptTime);
        System.out.println("Airlines ticketPrice: "+this.ticketPrice);
        System.out.println("Airlines isDelayed: "+this.isDelayed);
        System.out.println("Airlines terminal: "+this.terminal);
        System.out.println("Airlines pilotName: "+this.pilotName);
    }
}

