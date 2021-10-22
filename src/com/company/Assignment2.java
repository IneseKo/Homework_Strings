package com.company;

import java.util.HashSet;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        howManyWords(sentence);
        howManyTheWords(sentence);
        wordsWithS(sentence);
        repeatedWords(sentence);
        youToYou(sentence);
    }

    public static void howManyWords(String sentence) {
        String[] words = sentence.split("\\s+");
        System.out.println("There are " + (words.length) + " words in this Sentence.");
    }

    public static void howManyTheWords(String sentence) {
        String subString = "the";
        int countThe = sentence.split(subString, -1).length-1;
        System.out.println("There are " + countThe + " \"the\" words in the Sentence.");
    }

    public static void wordsWithS(String sentence) {
        String[] words = sentence.split("\\s+");
                int count = 0;
       for (String isWithS : words){
            if (isWithS.contains("s") || isWithS.contains("S")){
                count++;
            }
        }
        System.out.println("There are " + count + " words that have the character \"s\" in them.");
    }
    public static void repeatedWords(String sentence){
        String[] words = sentence.split("\\s+");
               Set<String> wordSet = new HashSet<>();
        System.out.println("These words are repeated in the Sentence several times:");
        for (String isDublicate : words){
            if(!wordSet.add(isDublicate)){
                System.out.println("\"" + isDublicate + "\" is repeated in this Sentence.");
            }
        }
    }
    public static void youToYou(String sentence){
        String convertedSentence = sentence.replace("you", "You");
        System.out.println(convertedSentence);
    }
}
