package com.company;

public class Assignment_1 {

    public static void main(String[] args) {
        String[] arrOne = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        startswithC(arrOne);
    }

    public static void startswithC(String[] arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i].startsWith("C")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that start with C.\n");
    }
}
