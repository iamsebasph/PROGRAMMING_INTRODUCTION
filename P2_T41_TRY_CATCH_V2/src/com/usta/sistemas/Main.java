package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     boolean b_funciona=false;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input the total people");
                int total_people = keyboard.nextInt();
                b_funciona=true;
            }catch (Exception e){
                System.err.println("This software allows only numbers");

            }


        }while (b_funciona==false);
    }
}
