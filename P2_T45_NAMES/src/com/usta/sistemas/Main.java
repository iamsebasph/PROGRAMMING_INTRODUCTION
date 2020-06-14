package com.usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static int total_names;
    public static String[] vector_names;

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: SEBASTIAN PEREZ HERNANDEZ
        //DATE: 02/06/2020
        //DESCRIPTION: Ask the user to enter N amount of people and these names are saved ina a file called "names.txt", the names must be saved one on each line (Each name must have a minimum of 5 letters)
        f_menu();
        f_fill_vector();
        f_save_file();
    }

    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println(".......................");
            System.out.println(".   SoftSaveDataUser  .");
            System.out.println(".   V1.0 01/06/2020   .");
            System.out.println(". Created by: SebasP  .");
            System.out.println(".......................");
            System.out.println("Input the total names: ");
            total_names = keyboard.nextInt();
            while (total_names < 1) {
                System.out.println("Sorry the total name´s greater than zero, input again the total names");
                System.out.println("Input the total names: ");

            }
            vector_names = new String[total_names];
        } catch (Exception e) {
            System.err.println("ERR: The system is finished, because: ");
            e.printStackTrace();
        }
    }

    public static void f_fill_vector() {
        //DESCRIPTION: This method fills the vector with Strings
        for (int i = 0; i < vector_names.length; i++) {
            vector_names[i] = f_input_name(i);
        }
    }

    public static String f_input_name(int i) {
        //DESCRIPTION: This method returns the name
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the name for the person(" + (i + 1) + ")");
            String name = keyboard.nextLine();
            while (name.length() < 5) {
                System.err.println("Sorry, the name should have more than 5 characters, Input again the name for the person(" + (i + 1) + ")");
                name = keyboard.nextLine();
            }
            return name;
        } catch (Exception e) {
            System.err.println("ERR: The software is finished because: ");
            e.printStackTrace();
            return "";
        }
    }
    public static void f_save_file(){
        //DESCRIPTION: This method walks the vector and saves the data into a file
        try {
            PrintWriter Myfile = new PrintWriter("C:/PRUEBA/names.txt","UTF-8");
            for (int i=0;i<vector_names.length;i++){
                Myfile.println(vector_names[i]);
            }
            Myfile.close();
            System.out.println("The data with name is saved into c:/PRUEBA/names.txt");
        } catch (Exception e) {
            System.err.println("The data didn´t saved nothing, because: ");
            e.printStackTrace();
        }
    }

}
