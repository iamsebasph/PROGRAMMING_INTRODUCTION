package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 28/04/2020
        //DESCRIPTION:This software shows the average of positive and negative numbers, also the ammount of 0.
        f_menu();
        f_operations_numbers();
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".SoftOperationsNumbers.");
        System.out.println(".   V1.0 28/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static void f_operations_numbers() {
        //DESCRIPTION: This method asks for two numbers
        int summatory_positives = 0, summatory_negatives = 0, total_zero = 0, number;
        int total_positives = 0, total_negatives = 0;
        double average_positives = 0, average_negatives = 0;
        for (int i = 1; i <= 10; i++) {
            number = f_user_number(i);
            if (number < 0) {
                summatory_negatives -= number;
                total_negatives++;
            } else if (number > 0) {
                summatory_positives += number;
                total_positives++;
            } else {
                total_zero++;
            }
        }
        if (total_positives > 0) {
            average_positives = summatory_positives / total_positives;
        }
        if (total_negatives > 0) {
            average_negatives = summatory_negatives / total_negatives;
        }
        System.out.println("The average of the negatives is: " + average_negatives);
        System.out.println("The average of the positives is: " + average_positives);
        System.out.println("The total zero numbers is: " + total_zero);
    }

    public static int f_user_number(int i) {
        //DESCRIPTION: This method returns a number from the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number: " + i);
        int number = keyboard.nextInt();
        return number;
    }
}
