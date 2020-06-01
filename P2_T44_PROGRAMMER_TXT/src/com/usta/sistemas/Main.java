package com.usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: SEBASTIAN PEREZ HERNANDEZ
        //DATE: 01/06/2020
        //DESCRIPTION: Create a text file where the personal data is stored
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = keyboard.nextLine();
        System.out.println("Input your biography: ");
        String biography = keyboard.nextLine();
        System.out.println("Input your mail direction: ");
        String email = keyboard.nextLine();
        System.out.println("Input your phone number: ");
        String phone = keyboard.nextLine();
        boolean ifSave = f_save_data(name, biography, email, phone);

    }
    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".   SoftSaveDataUser  .");
        System.out.println(".   V1.0 01/06/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }
    public static boolean f_save_data(String name, String biography, String email, String phone){
        //DESCRIPTION: Save the information into a file.
        boolean ifSave=true;
        try {
            PrintWriter Myfile = new PrintWriter("C:/PRUEBA/userdata.txt","UTF-8");
            Myfile.println("name: "+name);
            Myfile.println("Biography: "+biography);
            Myfile.println("Email: "+email);
            Myfile.println("Phone: "+phone);
            Myfile.close();
        } catch (Exception e) {
            System.out.println("The software cannot save the information");
            e.printStackTrace();
            ifSave=false;
        }
        return ifSave;
    }
}
