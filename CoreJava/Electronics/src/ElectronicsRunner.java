public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics electronics1=new Electronics();
        electronics1.info();

        Electronics electronics2=new Electronics("Bulb","Philips");
        electronics2.info();

        Electronics electronics3=new Electronics("iPhone","Phone",270000.99);
        electronics3.info();

        Electronics electronics4=new Electronics("Airpods","Red",true);
        electronics4.info();

        Electronics electronics5=new Electronics("Laptop","intel5",512);
        electronics5.info();

        Electronics electronics6=new Electronics("Laptop",24,true);
        electronics6.info();
    }
}
