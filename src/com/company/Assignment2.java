package com.company;


public class Assignment2 {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        howManyWords(sentence);
        howManyTheWords(sentence);
    }

    public static void howManyWords(String sentence) {
        String[] words = sentence.split("\\w+");
        System.out.println("There are " + (words.length) + " words in this Sentence.");
    }

    public static void howManyTheWords(String sentence) {
        String subString = "the";
        System.out.println("There are " + (sentence.split(subString, -1).length-1) + " \"the\" words in the Sentence.");
    }
}
