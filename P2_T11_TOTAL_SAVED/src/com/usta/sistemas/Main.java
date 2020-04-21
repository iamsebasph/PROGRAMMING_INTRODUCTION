package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 21/04/2020
        //DESCRIPTION: This software determines the total saved money per person in N months
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        int N = f_total_months();
        int total_saved =0, average_saved =0, money_saved;
        for (int i=1;i<=N;i=i+1){
            do {
                System.out.println("Input the money of the "+i+" month");
                money_saved = keyboard.nextInt();
            }while (money_saved<0);
       total_saved = total_saved+money_saved;
        }
        average_saved = total_saved/ N;
        System.out.println("The total saved money is: "+total_saved+" and the average is "+average_saved);
    }
    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".    SoftSavedMoney   .");
        System.out.println(".   V1.0 21/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
   public static int f_total_months (){
        //DESCRIPTION: This method returns the total of months
       Scanner keyboard = new Scanner(System.in);
       int N_months;
       do {
           System.out.println("Input the total months(The value must be grater than 0): ");
           N_months = keyboard.nextInt();
       }while(N_months < 1);
       return N_months;
   }
}
