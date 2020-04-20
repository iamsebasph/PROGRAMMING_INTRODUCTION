package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 14/04/2020
        //DESCRIPTION: This software
        f_menu();
        boolean rpta = f_compare();
        if (rpta == true){
            System.out.println("The two numbers are the same");
        }else{
            System.out.println("The two numbers aren´t the same");
        }

    }
    public static void f_menu(){
        System.out.println("...................");
        System.out.println(".SoftAverageHeight.");
        System.out.println(".   Version 1.0   .");
        System.out.println(".Created by: Sebas.");
        System.out.println("...................");
    }
    public static boolean f_compare(){
        System.out.println("This software asks two numbers and says if they are the same or not. Input the first number-");
        Scanner keyboard = new Scanner(System.in);
        boolean rpta;
        int n1 = keyboard.nextInt();
        System.out.println("Input the second number");
        int n2 = keyboard.nextInt();
        if (n1 == n2){
            rpta = true;
        }else{
          rpta = false;
        }
        return rpta;
    }
}
