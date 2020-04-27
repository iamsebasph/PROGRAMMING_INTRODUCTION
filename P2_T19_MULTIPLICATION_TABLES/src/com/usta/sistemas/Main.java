package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 27/04/2020
        //DESCRIPTION:This software prints the multiplication tables from 1 to 10.
        f_menu();
        int number;
        number = f_number();
        while (number != 0){
            f_generate_multiplication_table(number);
            number = f_number();
        }



    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(". SoftMultiplication  .");
        System.out.println(".   V1.0 27/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static int f_number(){
        //DESCRIPTION: This method asks for the user the multiplication table he wants
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the multiplication table you want (0 to exit)");
        int user_numb = keyboard.nextInt();
        while (user_numb < 0 || user_numb > 99){
            System.err.println("ERR: You only can input a number from 0 to 99");
            System.out.println("Input again the multiplication table you want (0 to exit)");
            user_numb = keyboard.nextInt();
        }
        return user_numb;
    }
    public static void f_generate_multiplication_table (int user_numb){
        //DESCRIPTION: This method shows the multiplication table that the user request
        System.out.println("The multiplication table of this number is: ");
        for (int i=1; i<=10;i++){
            System.out.println(user_numb+"X"+i+"="+user_numb*i);
        }
    }
}
