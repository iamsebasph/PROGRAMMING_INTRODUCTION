package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 21/04/2020
        //Description: This software makes a bill of a market
        f_menu();
        int N = f_total_products();
        double total_bill = 0;
        for (int i = 1; i <= N; i = i + 1) {
            total_bill = total_bill + f_valor_producto(i);
        }
        System.out.println("The total bill is: "+total_bill);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftBill       .");
        System.out.println(".   V1.0 21/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_total_products() {
        //DESCRIPTION: This method returns the number of total products.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total of products");
        int products = keyboard.nextInt();
        while (products < 1) {
            System.err.println("ERR: The value should be greater than 0");
            System.out.println("Input again the total of products");
            products = keyboard.nextInt();
        }
        return products;
    }

    public static double f_valor_producto(int i) {
        //DESCRIPTION: This method returns the total value of the product.
        System.out.println("Input the value of the product (" + i + "):");
        Scanner keyboard = new Scanner(System.in);
        double Value = keyboard.nextDouble();
        while (Value <= 0) {
            System.err.println("ERROR: The value must be greater than zero");
            System.out.println("Input again the value of the product (" + i + "):");
            Value = keyboard.nextDouble();
        }
        if (Value > 1000) {
            Value = Value * 1.19;
        }
        return Value;
    }
}
