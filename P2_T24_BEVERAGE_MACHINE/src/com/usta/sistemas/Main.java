package com.usta.sistemas;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 30/04/2020
        //DESCRIPTION:This software makes the role of an vending machine
        int product = f_menu_products();
        int cost_product = f_data_product(product, 1);//Retorna el costo del producto
        int product_time = f_data_product(product, 2); //Retorna el tiempo
        int money_user = f_input_money();
        while (money_user <= cost_product) {
            System.err.println("You need to input $"+ (cost_product-money_user)+" money ");
            money_user+= f_input_money();
        }
        int surplus = money_user-cost_product;
        System.out.println("Your surplus money is: $"+surplus+". The product time finish is: "+product_time+" seconds");
    }

    public static int f_menu_products() {
        //DESCRIPTION: This method displays the menu
        System.out.println("                         HOT DRINKS VENDING MACHINE");
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║       Aromática(1):    ║             $1300  ║        30 segundos  ║");
        System.out.println("║ ═════════════════════════════════════════════════════════════════ ║");
        System.out.println("║      Café Negro(2):    ║             $1000  ║        30 segundos  ║");
        System.out.println("║ ═════════════════════════════════════════════════════════════════ ║");
        System.out.println("║  Café con leche(3):    ║             $1900  ║        45 segundos  ║");
        System.out.println("║ ═════════════════════════════════════════════════════════════════ ║");
        System.out.println("║       Capuchino(4):    ║             $2500  ║        60 segundos  ║");
        System.out.println("║ ═════════════════════════════════════════════════════════════════ ║");
        System.out.println("║      Moccachino(5):    ║             $2700  ║        70 segundos  ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        System.out.println("Input the option: ");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 5) {
            System.err.println("ERR: The option does not exist");
            System.out.println("Input again the option: ");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static int f_input_money() {
        //DESCRIPTION: This method returns the money of the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your money: ");
        int money = keyboard.nextInt();
        while (money < 50 || money > 5000) {
            System.err.println("ERR: Your money cannot be processed ( between $50 and $5000");
            System.out.println("Input again the money : ");
            money = keyboard.nextInt();
        }
        return money;
    }

    public static int f_data_product(int product, int option) {
        //DESCRIPTION: This method returns two choises (money or time)
        int data_product;
        if (product == 1) { //Aromática
            if (option == 1) {
                data_product = 1300;
            } else {
                data_product = 30;
            }
        } else if (product == 2) { // Café Negro
            if (option == 1) {
                data_product = 1000;
            } else {
                data_product = 30;
            }

        } else if (product == 3) { // Café con leche
            if (option == 1) {
                data_product = 1900;
            } else {
                data_product = 40;
            }

        } else if (product == 4) { // Capuccino
            if (option == 1) {
                data_product = 2500;
            } else {
                data_product = 60;
            }

        } else { //Moccachino
            if (option == 1) {
                data_product = 2700;
            } else {
                data_product = 70;
            }
        }
        return data_product;
    }

}
