package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        // DATE: 01/04/2020
        // DESCRIPTION: This program calculates the shipping cost of ten different products
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        int pr1, pr2, pr3, pr4, pr5, destino, total_bill;
        System.out.println("Input the price of the first product");
        pr1 = keyboard.nextInt();
        System.out.println("Input the price of the second product");
        pr2 = keyboard.nextInt();
        System.out.println("Input the price of the third product");
        pr3 = keyboard.nextInt();
        System.out.println("Input the price of the fourth product");
        pr4 = keyboard.nextInt();
        System.out.println("Input the price of the fifth product");
        pr5 = keyboard.nextInt();
        System.out.println("Input the destine (1) North America (2) Central America (3) South America (4) Europe (5) Asia");
        destino = keyboard.nextInt();
        total_bill = pr1+pr2+pr3+pr4+pr5+f_shipping_cost(destino);
        System.out.println("The total bill is: "+total_bill);
    }
    public static void f_menu (){
        //Description: This method shows the menu
        System.out.println("...............................");
        System.out.println(".         shippingsoft        .");
        System.out.println(". Version 1.0 ..April.01.2020..");
        System.out.println(".   Maker: Sebastián Pérez    .");
        System.out.println("...............................");
    }
    public static int f_shipping_cost (int p_destine){
        //Description: This software calculates cost of ships
        int valor;
        if (p_destine == 1){
            valor = 11;
        }else
            if (p_destine == 2){
                valor = 10;
            }else
                if (p_destine == 3){
                    valor = 12;
                }else
                    if (p_destine == 4){
                        valor = 24;
                    }else
                        if (p_destine == 5){
                            valor = 27;
                        }else{
                            System.err.println("ERROR DESTINE NOT FOUND");
                            valor = 0;
                        }
                        return valor;
    }
}
