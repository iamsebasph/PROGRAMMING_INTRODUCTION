package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 19/03/2020
        //DESCRIPTION: This program calculates the volume of a cylinder, knowing the radius and the height
        Scanner keyboard= new Scanner(System.in);
        System.out.println("This program calculates the volume of a cylinder, input height(cm):");
        double height, radius, volume;
        height= keyboard.nextDouble();
        System.out.println("Input the radius(cm):");
        radius= keyboard.nextDouble();
        volume= 3.1415*(radius*radius)*height;
        System.out.println("The volume of the cylinder is:"+volume);
    }
}
