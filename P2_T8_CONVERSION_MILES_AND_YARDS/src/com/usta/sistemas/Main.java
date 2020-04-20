package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: SEBASTIAN PEREZ HERNANDEZ
        //DATE: 16/04/2020
        //DESCRIPTION: This software converts kilometers into miles, miles into kilometers, miles into yards and upsidedown
        f_menu();
        int option = f_option();
        if (option == 1){
            f_kilometers_to_miles();
        }else if (option == 2){
            f_kilometers_to_yards();
        }else if (option == 3){
            f_miles_to_kilometers();
        }else
            f_yards_to_kilometers();
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(". SoftConvertDistances.");
        System.out.println(".   V1.0 16/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_option() {
        //DESCRIPTION: This method return the option
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option: \n1-kilometers to miles \n2-kilometers to yards\n3-miles to kilometers \n4-yards to kilometers");
        int option = keyboard.nextInt();
        while (option < 1 || option > 4) {
            System.err.println("ERR: This option doesn´t exist");
            System.out.println("Input the option: \n1-kilometers to miles \n2-kilometers to yards\n3-miles to kilometers \n4-yards to kilometers");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_kilometers_to_miles() {
        //DESCRIPTION: This method converts kilometers into miles
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double miles = kilometers * 0.6214;
        System.out.println("The miles are: " + miles + "miles");
    }

    public static void f_kilometers_to_yards() {
        //DESCRIPTION: This method converts kilometers into yards
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double yards = kilometers * 1093.6;
        System.out.println("The yards are: " + yards + "yd");
    }

    public static void f_miles_to_kilometers() {
        //DESCRIPTION: This method converts miles into kilometers
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in miles (ml)");
        double miles = keyboard.nextDouble();
        double kilometer = miles / 0.62137;
        System.out.println("The kilometers are: " + kilometer + "km");
    }

    public static void f_yards_to_kilometers() {
        //DESCRIPTION: This method converts yards into kilometers
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in yards (yd)");
        double yards = keyboard.nextDouble();
        double kilometers = yards / 1093.6;
        System.out.println("The kilometers are: " + kilometers + "km");
    }
}
