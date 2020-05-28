package com.usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: Sebastian Perez Hernandez
        //DATE: 28/05/2020
        //DESCRIPTION: This software creates a text file
        try {  //PERFECT ACTION
            PrintWriter admin_files = new PrintWriter("C:/Users/iamse.LAPTOP-RM1OTBUQ/Documents/ prueba.txt");
            admin_files.println("First line");
            admin_files.println("Second line");
            admin_files.close();
        } catch (Exception e) {   //WHEN AN ERROR OCCURS
            System.err.println("ERR: The software is finished because: ");
            e.printStackTrace(); //Show error (engineer)
        }
    }
}
