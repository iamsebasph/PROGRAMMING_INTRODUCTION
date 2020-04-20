package com.usta;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Author: Sebastián Pérez H
        //Date: 2020/03/12
        //Description: This software input two variables and adds
        Scanner keyboard = new Scanner(System.in);
        int v1, v2, suma;
        System.out.println("This program adds two variabe, input the first variable");
        v1=keyboard.nextInt();
        System.out.println("Input the second variable");
        v2=keyboard.nextInt();
        suma= v1+v2;
        System.out.println("The sumatory is: "+suma);
    }
}
