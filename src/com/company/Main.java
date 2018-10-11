package com.company;

public class Main {

    public static void main(String[] args) {

        String[] stringsArray = {"abcd", "eaaaaaaaaah", "kate", "kaaate", "cat", "dog"};
        String[] changedStringsArray = changeCharacters(stringsArray);
        for (String line : changedStringsArray) {
            System.out.println(line);
        }
    }

    //Change by places first and last letters in each second string of array
    private static String[] changeCharacters(String[] stringsArray) {
        String newString = "";
        char firstCharacter = ' ';
        String middleCharacters = "";
        char lastCharacter = ' ';
        int stringLen = 0;
        for (int i = 1; i < stringsArray.length; i += 2) {
            stringLen = stringsArray[i].length();
            firstCharacter = stringsArray[i].charAt(0);
            middleCharacters = stringsArray[i].substring(1, stringLen - 1);
            lastCharacter = stringsArray[i].charAt(stringLen - 1);
            newString = lastCharacter + middleCharacters + firstCharacter;
            stringsArray[i] = newString;
        }
        return stringsArray;
    }

}
