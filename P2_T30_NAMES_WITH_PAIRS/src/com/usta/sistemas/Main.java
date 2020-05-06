package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 06/05/2020
        //DESCRIPTION:This software calculates the total of products with IVA included
        int total_numbers = f_menu_total_numbers();
        int[] vector_numbers = f_fill_vector(total_numbers);
        f_show_even_numbers(vector_numbers);
        f_show_odd_numbers(vector_numbers);
    }
    public static int f_menu_total_numbers() {
        System.out.println(".......................");
        System.out.println(".    SoftNamesPairs   .");
        System.out.println(".   V1.0 06/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the total numbers");
        Scanner keyboard = new Scanner(System.in);
        int total_numbers = keyboard.nextInt();
        while (total_numbers < 0){
            System.err.println("ERR: The number must be greater than 0");
            System.out.println("Input again the total numbers");
            total_numbers = keyboard.nextInt();
        }
        return total_numbers;
    }
    public static int[] f_fill_vector(int total_numbers){
        //DESCRIPTION: This method returns a vector with numbers
        int[] vector_numbers = new int[total_numbers];
        for (int i=0;i<total_numbers;i++){
            vector_numbers[i]= (int) Math.floor((Math.random() * (1000 - 100 + 1) + 1000));
        }
        return vector_numbers;
    }
    public static void f_show_even_numbers(int[] vector_numbers){
        //DESCRIPTION: This method shows the even numbers
        int total_evens =0;
        for (int number:vector_numbers){
            if ((number%2)==0){
                total_evens++;
                System.out.println("Even Number = "+number);
            }
        }
        System.out.println("The total even numbers are "+total_evens);
    }
    public static void f_show_odd_numbers(int[] vector_numbers){
        //DESCRIPTION: This method shows the odd numbers
        int total_odds =0;
        for (int number:vector_numbers){
            if ((number%2)!=0){
                total_odds++;
                System.out.println("Odd Number = "+number);
            }
        }
        System.out.println("The total odd numbers are "+total_odds);
    }
}
