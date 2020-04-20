package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 16/04/2020
        //DESCRIPTION: This software returns the first letter of a word and other functions.
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_first_letter();
        } else if (option == 2) {
            f_capital_letter();
        } else {
            f_replace_vowels();
        }
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".    SoftletterWord   .");
        System.out.println(".   V1.0 16/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_option() {
        //DESCRIPTION: This method return the option
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option: \n1-firstletter \n2-Capital letter\n3-replace vowels to @");
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERR: This option doesn´t exist");
            System.out.println("Input the option: \n1-fistletter \n2-Capital letter\n3-replace vowels to @");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_first_letter() {
        //DESCRIPTION: This method returns the first letter of a word
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("This word should have at least 5 letters");
            System.out.println("Input again the word:");
            word = keyboard.nextLine();
        }
        char[] letters = word.toCharArray();
        System.out.println("The first letter is: " + letters[0]);
    }

    public static void f_capital_letter() {
        //DESCRIPTION: This method turn lowercase to upper case
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("This word should have at least 5 letters");
            System.out.println("Input again the word:");
            word = keyboard.nextLine();
        }
        System.out.println("The upper case is: " + word.toUpperCase());
    }

    public static void f_replace_vowels() {
        //DESCRIPTION: This method replace vowels into @
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("This word should have at least 5 letters");
            System.out.println("Input again the word:");
            word = keyboard.nextLine();
        }
        String word2 = word.toLowerCase();
        System.out.println("The replaced words are: " + word2.replace("a", "@").replace("e", "@").replace("i", "@").replace("o", "@").replace("u", "@"));
    }
}
