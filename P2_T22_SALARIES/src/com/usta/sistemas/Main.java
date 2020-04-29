package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 28/04/2020
        //DESCRIPTION:This software Ask for a number N, enter N salaries, and display the maximum salary.
        f_menu();
        int number = f_user_number();
        int total_primes =0;
        for (int i=1; i<= number; i++){
            if (f_if_prime_number(i)==true){
               total_primes++;
                System.out.println("NUmber "+i+" is prime");
            }
        }
        System.out.println("The total prime is: "+total_primes);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftSalary     .");
        System.out.println(".   V1.0 29/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_user_number() {
        //DESCRIPTION: This method receives the number from the user
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Input a number greater than 1: ");
        number = keyboard.nextInt();
        while (number <= 0) {
            System.err.println("ERR: The number must be greater than 1");
            System.out.println("Input again a number greater than 1: ");
            number = keyboard.nextInt();
        }
        return number;
    }

    public static boolean f_if_prime_number(int number) {
        //DESCRIPTION: This method contains the function of n_primes
        int contador = 0;
        for (int i=1; i<= number; i++){
           if (number%i==0){
               contador=contador+1;
           }
        }
        if (contador <=2 ){
            return true;
        }else{
            return false;
        }
    }
}
