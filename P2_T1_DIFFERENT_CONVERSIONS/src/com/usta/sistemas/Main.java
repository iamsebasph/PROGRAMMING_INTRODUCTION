package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 13/04/2020
        //DESCRIPTION: Build a program that uses differetn methods to convert C to F, F to C, K to C and C to K
        int kind_from, kind_to;
        f_menu();
      kind_from = f_kind_from_grades();
       if (kind_from != 0){
           kind_from= f_kind_to_grades()
       }
    }
    public static void f_menu(){
        //DESCRIPTION: This method show the menu of this software
        System.out.println("----------------------");
        System.out.println("|     SoftConvert    |");
        System.out.println("|Version 1.0 20200413|");
        System.out.println("|Created by:Sebastian|");
        System.out.println("----------------------");
        System.out.println("Input the options of grades:\n1-celsius \n2-farenheit \n3-kelvin ");
    }
    public static int f_kind_from_grades(){
        //DESCRIPTION: This method returns the  input the kind of grades
        Scanner keyboard = new Scanner(System.in);
        int opt = keyboard.nextInt();
        if (opt == 1 || opt == 2 || opt ==3 ){
               System.out.println("started");
        }else{
            System.err.println("ERR: Finish the software, the reason is the class doesn´t exist");
            opt =0;
        }
        return opt;
    }
    public static int f_kind_to_grades(int kind_from){
        //DESCRIPTION: This method return to kind grades
        System.out.println("");

    }
}
