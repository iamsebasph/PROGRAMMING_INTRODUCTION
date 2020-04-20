package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: SEBASTIÁN PÉREZ HERNÁNDEZ
        //DATE: 20/04/2020
        //DESCRIPTION: This software calculates the average height of N children
        f_menu();
        int total_children = f_total_children();
        double summatory =0, average =0;
        for (int i=1;i<= total_children; i=i+1){
summatory = summatory+f_height_children(i);
        }
        average = summatory/total_children;
        System.out.println("The average of height is: "+average+"mts");
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".  SoftAverageHeight  .");
        System.out.println(".   V1.0 20/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static int f_total_children (){
        //DESCRIPTION: This method returns the total of children
        System.out.println("Input the total children to calculate the height");
        Scanner keyboard = new Scanner(System.in);
        int children = keyboard.nextInt();
        while (children < 1){
            System.err.println("ERR: The value should be greater than zero ");
            System.out.println("Input again the total children to calculate the height");
            children = keyboard.nextInt();
        }
        return children;
    }
    public static double f_height_children (int i){
        //DESCRIPTION: This method returns the height of a child.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the height (mts) of the child"+i);
        double height = keyboard.nextDouble();
        while (height < 0.2 || height > 2){ //20 cm o 2mts
            System.err.println("ERR: The value should be between 0.2 and 2 mts");
            System.out.println("Input again the height (mts) of the child"+i);
            height = keyboard.nextDouble();
        }
return height;
    }
}
