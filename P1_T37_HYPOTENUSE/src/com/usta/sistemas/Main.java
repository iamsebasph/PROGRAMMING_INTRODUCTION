package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 19/03/2020
        //DESCRIPTION: This program calculates the hypotenuse of a triangle
        Scanner keyboard= new Scanner(System.in);
        System.out.println("This program calculates the hypotenuse of a triangle, input the first leg (cm): ");
        double cat1, cat2, hyp;
        cat1= keyboard.nextDouble();
        System.out.println("Input the second leg(cm): ");
        cat2= keyboard.nextDouble();
        hyp= Math.sqrt((cat1*cat1) + (cat2*cat2));
        System.out.println("The hypotenuse is: "+hyp);
    }
}
