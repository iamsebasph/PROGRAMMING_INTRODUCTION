package com.usta;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Author: Sebastián Pérez
        //Date: 12/03/2020
        //Description: This program realize three numbers, adds and average them
        Scanner keyboard = new Scanner(System.in);
        int v1, v2, v3, suma;
        double promedio;
        System.out.println("This program adds three variables, and average them, input the first variable");
        v1=keyboard.nextInt();
        System.out.println("Input the second variable");
        v2=keyboard.nextInt();
        System.out.println("Input the third variable");
        v3=keyboard.nextInt();
        suma= v1+v2+v3;
        System.out.println("The sum is: "+suma);
        promedio= suma/3.0;
        System.out.println("The average is: "+promedio);
  }
}
