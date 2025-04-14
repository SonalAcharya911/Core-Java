import java.util.Arrays;

public class StringOps {
    public void revString(String str){
        System.out.println("running revString...");
        String revString="";
        char[] arr=str.toCharArray();
        System.out.println(arr);
        for(int i=arr.length-1;i>=0;i--){
            revString=revString+str.charAt(i);
        }

        System.out.println("reversed String is: "+revString);

    }

    public void countWords(String sentence){
        System.out.println("running cuntWords....");
        String[] words=sentence.split(" ");
        System.out.println("the words are ");
        int i=0;
        for(String word : words){
            System.out.println(word);

            i++;
        }
        System.out.println("no of words are "+i);
    }

    public void checkWord(String targetWord,String sentence){
        System.out.println("running checkWord....");
        if(sentence!=null) {
            String words[] = sentence.split(" ");
            for (String word : words) {
                if (word.equals(targetWord)) {
                    System.out.println("the word " + targetWord + " is present in the given sentence");
                    break;
                } else {
                    System.out.println("word not found");
                }
            }
        }
        else{
            System.out.println("sentence not found");
        }
    }

    public void countChar(String sentence){
        System.out.println("running countChar....");
        char[] arr=sentence.toCharArray();
        int i=0;
        for(char character: arr){
            i++;
        }
        System.out.println("no of characters are: "+i);
    }

    public void countSpace(String sentence){
        System.out.println("running countSpace....");
        char[] arr=sentence.toCharArray();
        int count=0;
        for(char character:arr){
            if(character==' '){
                count++;
            }
        }
        System.out.println("no of spaces : "+count);
    }

    public void replaceSpace(String sentence){
        System.out.println("running replaceSpace....");
        System.out.println("before replacement \n"+sentence);
        String newSentence=sentence.replaceAll(" ","%");
        System.out.println("after replacement\n"+newSentence);
    }

    public void checkWordFrequency(String sentence)
    {
        System.out.println("running checkWordFrequency");
        String[] words=sentence.split(" ");

        for (int j = 0; j < words.length; j++) {

            int count = 1;

            if (words[j].equals("")) {
                continue;
            }
            for (int i = j + 1; i < words.length; i++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[i] = "";
                }
            }
            System.out.println(words[j] + " is repeated " + count + " times");

        }
    }

    public void checkCharFrequency(String sentence){
        System.out.println("running checkWordFrequency");
        char[] chars=sentence.toCharArray();

        for (int j = 0; j < chars.length; j++) {

            int count = 1;

            if (chars[j]==' ') {
                continue;
            }
            for (int i = j + 1; i < chars.length; i++) {
                if (chars[i]==chars[j]) {
                    count++;
                    chars[i] =' ';
                }
            }
            System.out.println(chars[j] + " is repeated " + count + " times");

        }


    }




}
