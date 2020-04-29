package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 29/04/2020
        //DESCRIPTION:This software reads 5 numbers and show them in reverse order to the one entered.
        f_menu();
        f_number_user();
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".  SoftReverseOrders  .");
        System.out.println(".   V1.0 29/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static void f_number_user(){
        //This method returns the number that the user introduce
        Scanner keyboard = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        double average;
        System.out.println("Input the number 1: ");
        n1 = keyboard.nextInt();
        System.out.println("Input the number 2: ");
        n2 = keyboard.nextInt();
        System.out.println("Input the number 3: ");
        n3 = keyboard.nextInt();
        System.out.println("Input the number 4: ");
        n4 = keyboard.nextInt();
        System.out.println("Input the number 5: ");
        n5 = keyboard.nextInt();
        average = (n1+n2+n3+n4+n5)/5;
        System.out.println("The reverse order of the numbers is: "+n5+", "+n4+", "+n3+", "+n2+", "+n1);
        System.out.println("The average is: "+average);
    }
}
