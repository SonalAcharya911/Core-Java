package com.xworkz.mappy.runner;

import java.util.*;

public class ParagraphRunner {
    public static void  main(String[] args) {
        String str="It was a sweltering day with the sun overhead when" +
                " birds and animals could find very little to drink to quench" +
                " their thirst. Among them was a thirsty crow who searched for" +
                " water all over the fields. He looked everywhere, but there was " +
                "not a drop to drink. He felt weak and sad and thought to himself," +
                " “Caw, caw, caw. I have been searching for water since the morning, " +
                "but there is not a drop in sight!” “The thirst is making me dizzy.” " +
                "Just as the crow was glooming, he suddenly saw a water pitcher." +
                " “Thank goodness! I hope there is some water in that little pitcher.” " +
                "He flew straight down to that pitcher to see if water was left in it. " +
                "And to his surprise, there was some water in the pitcher.As the crow pushed " +
                "his head into the pitcher, it could not go deeper. “Oh no. I could not get to " +
                "the water.” The pitcher was high with a narrow neck, and the water level was too " +
                "low. He tried pushing the pitcher to a side for the water to flow out. “If I tilt " +
                "this pitcher, maybe the water would come out, and I will easily drink it.” But the " +
                "pitcher was very heavy to tilt. The crow did not lose hope. He looked around " +
                "and started thinking of a way to get water out of the pitcher. Then, an idea " +
                "struck him! He saw some pebbles on the ground. The crow started collecting pebbles " +
                "one by one and dropped them into the pitcher. As more and more pebbles went into the " +
                "pitcher, the water rose up. Soon enough, the water came to a level through which the " +
                "crow could drink water. He drank the water happily and thanked mother nature.";


        String[] words=str.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","").split(" ");

        Map<String, Integer> wordMap=new HashMap<>();

        for(String word: words){
            if(!wordMap.containsKey(word)){
                wordMap.put(word,1);
            }
            else{
                wordMap.put(word,wordMap.get(word)+1);
            }
        }

        wordMap.entrySet()
                .stream()
                .sorted((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue())).forEach(System.out::println);

    }
}
