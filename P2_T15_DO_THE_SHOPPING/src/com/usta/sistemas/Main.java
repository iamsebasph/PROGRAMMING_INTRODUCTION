package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 21/04/2020
        //DESCRIPTION:This software calculates the market of the month of a housewife with $500000
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int summatory=0, cost_product, total_product=0;
        do {
            total_product+=1;
            System.out.println("Input the cost of the product: ("+total_product+")");
            cost_product = keyboard.nextInt();
            summatory+=cost_product;
            System.out.println("Te temporally bill is: "+summatory);
        } while (summatory<=500000);
        summatory-=cost_product; //es igual a summatory=summatory - cost product
        total_product-=1;
        System.out.println("Total bill "+summatory+", total products: "+total_product);
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".   SoftMakeMarket    .");
        System.out.println(".   V1.0 22/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
}
