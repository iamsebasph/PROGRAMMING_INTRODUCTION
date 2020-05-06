package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         //AUTHOR:Sebastián Pérez Hernández
        //DATE: 06/05/2020
        //DESCRIPTION:This software asks for N number of people´s names and determines how many names have the letter "a" and how many have the letter "e"
        int total_people = f_menu_total_people();
        String[] vector_names = f_fill_vector(total_people);
        f_show_letter_a(vector_names);
        f_show_letter_e(vector_names);
    }
    public static int f_menu_total_people() {
        System.out.println(".......................");
        System.out.println(".     SoftAgeVector   .");
        System.out.println(".   V1.0 06/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the total people you need: ");
        Scanner keyboard = new Scanner(System.in);
        int total_people = keyboard.nextInt();
        while (total_people < 0){
            System.err.println("ERR: You must input a number greater than 0");
            System.out.println("Input again the total people you need: ");
            total_people = keyboard.nextInt();
        }
        return total_people;
    }
    public static String[] f_fill_vector (int total_people){
        //DESCRIPTION: This method returns a filled vector
        Scanner keyboard = new Scanner(System.in);
        String[] vector_names = new String[total_people];
        for (int i=0;i<total_people;i++){
            System.out.println("Input the name of the "+(i+1)+" person");
            vector_names[i] = keyboard.nextLine();
        }
        return vector_names;
    }
    public static void f_show_letter_a (String[] vector_names){
        //DESCRIPTION: This method counts the names that have the letter "a"
        int total_letters_a=0;
        for (int i=0;i<vector_names.length;i++){
            if (vector_names[i].indexOf("a")>=0){
                total_letters_a++;
            }
        }
        System.out.println("The total names that contains the letter -a- are: "+total_letters_a);
    }
    public static void f_show_letter_e (String[] vector_names){
        //DESCRIPTION: This method counts the names that have the letter "e"
        int total_letters_e=0;
        for (int i=0;i<vector_names.length;i++){
            if (vector_names[i].indexOf("e")>=0){
                total_letters_e++;
            }
        }
        System.out.println("The total names that contains the letter -e- are: "+total_letters_e);
    }
}
