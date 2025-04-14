public class StringRunner {
    public static void main(String[] args) {
        String name="Sonal";
        String newName=name.concat(" Vinod");
        System.out.println("name: "+name);
        System.out.println("newName: "+newName);

        String fullName="Sonal Vinod";

        System.out.println("full Name= "+fullName);

        if(newName==fullName){
            System.out.println("matching");
        }else{
            System.out.println("not matching");
        }

        System.out.println("address of newName: "+ newName.hashCode());
        System.out.println("address of fullName: "+ newName.hashCode());


        StringOps stringOps=new StringOps();
        String sentence="My name is Sonal and I am a software intern at Xworkz";
        String sentence1="betty bought a bit of butter but the butter was bitter so betty bought a better butter to make the bitter butter better";
        stringOps.revString("Sonal Vinod Karma");
        stringOps.countWords(sentence);
        stringOps.checkWord("My",sentence);
        stringOps.countChar("Sonal");
        stringOps.countSpace(sentence);
        stringOps.replaceSpace(sentence);
        stringOps.checkWordFrequency(sentence1);
        stringOps.checkCharFrequency("Sonal Vinod Karma ");

    }
}
