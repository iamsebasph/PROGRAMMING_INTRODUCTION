package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 13/04/2020
        //DESCRIPTION:
        f_menu();
        double summatory= f_sum_height();
        System.out.println("The summatory is: "+ summatory+"mts");
        f_average(summatory);
    }
    public static void f_menu(){
        System.out.println("...................");
        System.out.println(".SoftAverageHeight.");
        System.out.println(".   Version 1.0   .");
        System.out.println(".Created by: Sebas.");
        System.out.println("...................");
    }
    public static double f_sum_height(){
        //DESCRIPTION: This method calculate the sumatory of 5 height
        Scanner keyboard = new Scanner(System.in);
        double summatory, height1, height2, height3, height4, height5;
        System.out.println("Input the first height (mts): ");
        height1 =keyboard.nextDouble();
        System.out.println("Input the second height(mts): ");
        height2 =keyboard.nextDouble();
        System.out.println("Input the third height(mts): ");
        height3 =keyboard.nextDouble();
        System.out.println("Input the fourth height(mts): ");
        height4 = keyboard.nextDouble();
        System.out.println("Input the fifth height(mts): ");
        height5 = keyboard.nextDouble();
        summatory = height1+height2+height3+height4+height5;
        return summatory;
    }
    public static void f_average(double summatory){
        //DESCRIPTION: This method calculates the average
        double average=summatory/5;
        System.out.println("The average is: "+average+"mts");
    }
}
