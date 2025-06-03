package com.xworkz.tasks.internal;

public class StringPattern {
    public void compress(String pattern){
        for(int i=0;i<=pattern.length();i++){
            String newPattern="";
            int count=0;
            if(pattern.charAt(i+1)==pattern.charAt(i)){
                count++;
            }
            else{
                newPattern=pattern.charAt(i)+count+"";
            }
        }
    }

    public int numPattern(int n){
        for(int i=1;i<=(n*(n+1)/2);i++) {

            for (int j = i; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        return (n*(n+1)/2);
    }


    public static void main(String[] args) {
        StringPattern stringPattern=new StringPattern();
//        stringPattern.compress("aaabbbccccc");
        stringPattern.numPattern(5);

        int result=stringPattern.numPattern(5);

        System.out.println(result);
    }
}
