package com.usta;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Author: Sebastián Pérez
        //Date: 12/03/2020
        //Description: This program declares two variables of type int, and two variables of type double
        Scanner keyboard = new Scanner(System.in);
        int X, Y, resultInt;
        double  N, M, resultDouble;
        System.out.println("This program realize many mathematics operations with 4 numbers, input the first integer");
        X=keyboard.nextInt();
        System.out.println("Input the second integer");
        Y=keyboard.nextInt();
        System.out.println("Input the third rational");
        N=keyboard.nextDouble();
        System.out.println("Input the fourth rational");
        M=keyboard.nextDouble();
        resultInt=X+Y;
        System.out.println("valuable of the first integer is: "+X+" The second integer is: "+Y+" The third rational is: "+N+" The fourth rational is: "+M+
                " The sum of X+Y is: "+resultInt);
        resultInt=X-Y;
        System.out.println("The difference of X-Y is: "+resultInt);
        resultInt=X*Y;
        System.out.println("The product of X*Y is: "+resultInt);
        resultInt=X/Y;
        System.out.println("The division of X/Y is: "+resultInt);



    }
}
