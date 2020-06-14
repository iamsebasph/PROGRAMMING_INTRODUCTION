package com.usta.sistemas;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static int total_names;

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: SEBASTIAN PEREZ HERNANDEZ
        //DATE: 02/06/2020
        //DESCRIPTION: This software saves new names, delete or replace them in an existent file.
        int opt = f_menu();
        do {
            if (opt == 1) {
                f_add_names();
            } else if (opt == 2) {
                f_delete_names();
            } else {
                f_show_names();
            }
            opt = f_menu();
        } while (opt != 0);
    }

    public static int f_menu() {
        //DESCRIPTION: This method displays the menu
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println(".......................");
            System.out.println(".   SoftSaveDataUser  .");
            System.out.println(".   V1.0 01/06/2020   .");
            System.out.println(". Created by: SebasP  .");
            System.out.println(".......................");
            System.out.println("Select an option: " +
                    "\n1- enter new names" +
                    "\n2- Delete old names" +
                    "\n3- visualize the archive" +
                    "\n0- Exit");
            int option = keyboard.nextByte();
            while (option < 1 || option > 3) {
                System.out.println("ERROR: The input must be between 1 and 3, Retry: ");
                option = keyboard.nextByte();
            }
            return option;
        } catch (Exception e) {
            System.err.println("ERR: The system is finished, because: ");
            e.printStackTrace();
            return 0;
        }
    }

    public static void f_show_names() {
        try {
            Scanner Myfile = new Scanner(new File("C:/PRUEBA/names.txt"));
            System.out.println("The information of the file is: ");
            while (Myfile.hasNextLine()) {
                System.out.println(Myfile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERR: The method has an error because: ");
            e.printStackTrace();
        }
    }

    public static void f_delete_names() {
        try {
            PrintWriter delete = new PrintWriter("C:/PRUEBA/names.txt", "UTF-8");
            delete.println("");
            delete.close();
            System.out.println("The information was deleted with success");
        } catch (Exception e) {
            System.out.println("ERR: The program has finished, because: ");
            e.printStackTrace();
        }
    }

    public static void f_add_names() {
        try {
            File file = new File("C:/PRUEBA/names.txt");
            if (file.exists()) {
                FileWriter Myfile = new FileWriter("C:/PRUEBA/names.txt", true);
                BufferedWriter dataFile = new BufferedWriter(Myfile);
                dataFile.write(f_input_names());
            } else {
                System.out.println("Sorry, the file int the location does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String f_input_names() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the new name: ");
        String name = keyboard.nextLine();
        while (name.length() < 5) {
            System.out.println("ERR: The size of the name should be greater than five of greater");
            System.out.println("Input again the new name");
            name = keyboard.nextLine();
        }
        return name;
    }
}
