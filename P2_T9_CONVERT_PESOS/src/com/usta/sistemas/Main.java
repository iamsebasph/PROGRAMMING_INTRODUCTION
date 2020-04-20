package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: SEBASTIAN PEREZ HERNANDEZ
        //DATE: 16/04/2020
        //DESCRIPTION: This software converts pesos colombianos to dollars, and pesos colombianos to euros.
        f_menu();
        int option = f_option();
        while (option != 0){
            if (option == 1){
                f_pesos_to_dollars();
            }else if (option == 2){
                f__pesos_to_euros();
            }else
                f__euros_to_dollars();
        }
        option = f_option();
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".  SoftConvertMoney   .");
        System.out.println(".   V1.0 16/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_option() {
        //DESCRIPTION: This method return the option
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option: \n1-pesos to dollars \n2-pesos to euros\n3-euros to dollars \n0- Exit");
        int option = keyboard.nextInt();
        while (option < 0 || option > 3) {
            System.err.println("ERR: This option doesn´t exist");
            System.out.println("Input the option: \n1-pesos to dollars \n2-pesos to euros\n3-euros to dollars \n0- Exit");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_pesos_to_dollars() {
        //DESCRIPTION: This method converts pesos colombianos to dollars
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount of money (pesos)");
        int money = keyboard.nextInt();
        while (money < 1000) {
            System.err.println("ERR:Lower to 1000, no convert");
            System.out.println("input again the amount of money (pesos)");
            money = keyboard.nextInt();
        }
        double dollars = money * 3937;
        System.out.println("The dollars are: "+dollars);
    }
    public static void f__pesos_to_euros (){
        //DESCRIPTION: This method converts pesos colombianos to euros
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount of money (pesos)");
        int money = keyboard.nextInt();
        while (money < 1000) {
            System.err.println("ERR:Lower to 1000, no convert");
            System.out.println("input again the amount of money (pesos)");
            money = keyboard.nextInt();
        }
        double euros = money * 4310;
        System.out.println("The euros are: "+euros);
    }
    public static void f__euros_to_dollars (){
        //DESCRIPTION: This method converts pesos euros to dollars
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount of money (euros)");
        int money = keyboard.nextInt();
        while (money < 10) {
            System.err.println("ERR:Lower to 10, no convert");
            System.out.println("input again the amount of money (euros)");
            money = keyboard.nextInt();
        }
        double dollars = money *0.92;
        System.out.println("The euros are: "+dollars);
    }
}


