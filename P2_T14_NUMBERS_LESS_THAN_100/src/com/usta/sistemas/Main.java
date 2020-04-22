package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 22/04/2020
        //DESCRIPTION: This software read form the keyboard a series of numbers until you get one low than 100, and determines the sum and average
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int total_numbers=0;
        double summatory =0, average=0, number;
        System.out.println("Input a number");
        number = keyboard.nextDouble();
        while (number > 100){
            summatory=summatory+number;
            total_numbers= total_numbers+1;
            System.out.println("Input other number");
            number = keyboard.nextDouble();
        }
        if (total_numbers != 0){
            average=summatory/total_numbers;
        }
        System.out.println("The summatory of "+total_numbers+"is= "+summatory+" and the average is : "+average);
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftNumbers    .");
        System.out.println(".   V1.0 22/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

}
