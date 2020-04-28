package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 28/04/2020
        //DESCRIPTION:This software counts the quantity of digits of a number
        f_menu();
        int total_digits = 0;
        int number_user = f_number();
        if (number_user != 0){
            while (number_user != 0) {
                number_user = number_user / 10;
                total_digits++;
            }
        }else{
            total_digits=1;
        }

        System.out.println("The total digits of the number are: "+total_digits);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".    SoftCountDigit   .");
        System.out.println(".   V1.0 28/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_number() {
        //DESCRIPTION: This method returns the number that the user inputs.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, input any number: ");
        int number = keyboard.nextInt();
        return number;
    }
}
