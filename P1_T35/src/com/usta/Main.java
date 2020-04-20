package com.usta;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Author: Sebastián Pérez
        //Date: 12/03/2020
        //Description: This program receives two variables and print the difference
        Scanner keyboard = new Scanner(System.in);
                int v1, v2, difference;
        System.out.println("This program receives two years of birth and calculate the difference, input the first year");
        v1= keyboard.nextInt();
        System.out.println("Input the second year");
        v2= keyboard.nextInt();
        difference = v1-v2;
        System.out.println("The difference is: "+difference);
    }
}
