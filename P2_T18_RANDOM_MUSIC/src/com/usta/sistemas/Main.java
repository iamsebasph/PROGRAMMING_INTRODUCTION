package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 23/04/2020
        //DESCRIPTION:This software generates a chance game with a random number from 1 to 100
        f_menu();
        int random_number = f_random_number();
        int number_user = f_input_number();
        int attempts = 5;
        while (number_user != random_number && attempts >1){
            attempts--;
            System.out.println("Sorry, you didn´t get the correct number (Attempts = "+attempts+")");
            number_user = f_input_number();
        }
        if (attempts > 1){
            System.out.println("Congratulations, you won an Olimpo hamburguer");
        }
        else{
            System.out.println("Sorry. You lose. The random number was: "+random_number);
        }
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".     BurgerSoft      .");
        System.out.println(".   V1.0 27/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static int f_random_number(){
        //DESCRIPTION: This function creates the random number
        int number = (int)Math.floor(Math.random()*100+1);
        if (number < 50){
            System.out.println("HINT1: The number is minor than 50");
        }else{
            System.out.println("HINT1: The number is greater than 50");
        }
        if (number % 2 == 0){
            System.out.println("HINT2: The number is pair");
        }else{
            System.out.println("HINT2: The number is impair");
        }
        return number;
    }
    public static int f_input_number (){
        //DESCRIPTION: This function receives the number from the user
        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.println("Input the number between 0 to 100: " );
        input = keyboard.nextInt();
        while (input < 0 || input > 100){
            System.err.println("ERROR: The input number must be between 0 and 100 \n Retry: ");
            input = keyboard.nextInt();
        }
        return input;
    }
}
