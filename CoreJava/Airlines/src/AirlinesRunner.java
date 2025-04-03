public class AirlinesRunner {
    public static void main(String[] args) {
        Airlines airlines1=new Airlines("Indigo");
        airlines1.printInfo();

        Airlines airlines2=new Airlines("Air India","AI9453",3520.99,"Anandan Varma");
        airlines2.printInfo();

        Airlines airlines3=new Airlines("Kempegowda International Airport","Cochin International Airport");
        airlines3.printInfo();

        Airlines airlines4=new Airlines("12:30:00","14:30:00",false);
        airlines4.printInfo();

        Airlines airlines5=new Airlines(4,"Indira Gandhi International Airport","14:15:00");
        airlines5.printInfo();

    }


}
