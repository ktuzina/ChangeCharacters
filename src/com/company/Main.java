package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strings_array = {"abcd", "eaaaaaaaaah", "kate", "kaaate", "cat", "dog"};
        String[] changed_strings_array = change_characters(strings_array);
        for (int i = 0; i < changed_strings_array.length; i++){
            System.out.println(changed_strings_array[i]);
        }
    }

    //Change by places first and last letters in each second string of array
    private static String[] change_characters(String[] strings_array){
        String new_string = "";
        char first_character = ' ';
        String middle_characters = "";
        char last_character = ' ';
        int string_len = 0;
        for (int i = 1; i < strings_array.length; i += 2){
            string_len = strings_array[i].length();
            first_character = strings_array[i].charAt(0);
            middle_characters = strings_array[i].substring(1, string_len - 1);
            last_character = strings_array[i].charAt(string_len - 1);
            new_string = last_character + middle_characters + first_character;
            strings_array[i] = new_string;
        }
        return strings_array;
    }

}
