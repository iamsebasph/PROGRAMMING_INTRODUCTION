package com.usta.sistemas;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastian Perez Hernandez
        //DATE: 01/06/2020
        //DESCRIPTION: This software shows the information
        try {
            Scanner file = new Scanner(new File("C:/PRUEBA/prueba.txt"));
            while (file.hasNextLine()){
                System.out.println(file.nextLine());
            }
            file.close();
        } catch (Exception e) {
            System.out.println("The software has finished, ERR:");
            e.printStackTrace();
        }

    }
}
