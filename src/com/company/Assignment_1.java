package com.company;

public class Assignment_1 {

    public static void main(String[] args) {
        String[] arrOne = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        startswithC(arrOne);
        endswithE(arrOne);
        nameLengthIs5(arrOne);
        subStringTe(arrOne);
        histogram(arrOne);
    }

    public static void startswithC(String[] arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].startsWith("C")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that start with a C.\n");
    }

    public static void endswithE(String[] arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].endsWith("e")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that ends with an e.\n");
    }

    public static void nameLengthIs5(String[] arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].length() == 5) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that have 5 letters in their word.\n");
    }

    public static void subStringTe(String[] arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].contains("te")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " cases in the Array that have substring te.\n");
    }
    public static void histogram(String[] arrOne) {

        int nameLength = 0;

        while (nameLength < 9) {
            int wordAmount = 0;
            for (int i=0; i<arrOne.length; i++) {
                if (arrOne[i].length() == nameLength) {

                    wordAmount++;
                }

            }
            System.out.println(wordAmount + " words in the Array that have the name length " + nameLength);
            nameLength++;
        }
    }
    
}
