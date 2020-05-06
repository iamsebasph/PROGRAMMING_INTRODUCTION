package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 05/05/2020
        //DESCRIPTION:This software calculates what number is the greater or the minor
        int total_number = f_menu_total_numbers();
        int[] numbers = f_fill_vector_numbers(total_number);
        f_show_bigger_number(vector_num);
    }

    public static int f_menu_total_numbers() {
        //DESCRIPTION: This method returns the total number
        System.out.println(".......................");
        System.out.println(".   SoftInputNumbers  .");
        System.out.println(".   V1.0 05/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the total numbers");
        Scanner keyboard = new Scanner(System.in);
        int total_number = keyboard.nextInt();
        while (total_number <= 0) {
            System.err.println("ERR: The value can´t be minor or same zero");
            System.out.println("Input again the total numbers");
            total_number = keyboard.nextInt();
        }
        return total_number;
    }
    public static int[] f_fill_vector_numbers(int total_numbers) {
        //DESCRIPTION: This method fills the vector
        Scanner keyboard = new Scanner(System.in);
        int[] vector = new int[total_numbers];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Input the integer number (" + (i + 1) + ")");
            vector[i] = keyboard.nextInt();
        }
        return vector;
    }
    public static void f_show_bigger_number (int[] vector_numbers){
        //DESCRIPTION: This method shows the bigger number which "vector" contains
        int bigger_number=0;
        for (int i=0; i< vector_numbers.length;i++){
            if (i==0){
               bigger_number= vector_numbers[i];
            }else{
                if (bigger_number<vector_numbers[i]){
                    bigger_number=vector_numbers[i];
                }
            }

        }
        System.out.println("The bigger number is: "+bigger_number);
    }
    public static void f_show_minor_number (int[] vector_numbers){
        //DESCRIPTION: This method shows the bigger number which "vector" contains
        int minor_number=0;
        for (int i=0; i< vector_numbers.length;i++){
            if (i==0){
                minor_number= vector_numbers[i];
            }else{
                if (minor_number>vector_numbers[i]){
                    minor_number=vector_numbers[i];
                }
            }
            System.out.println("The vector "+i+);

        }
        System.out.println("The bigger number is: "+bigger_number);
    }
}
