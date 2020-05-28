package com.usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);



    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 26/05/2020
        //DESCRIPTION:This software generates 12 wages for N employees. Determines what was the employee with the highest wage,
        // the value of the total of wages and the average.
        int rows = f_menu_N_employees();
        int[][] matrix_wages = new int[rows][12];
        int highest=0, employee_column=0;
        f_fill_matrix(matrix_wages);
        int counter=0;
        double average;
        for (int i = 0; i < matrix_wages.length; i++) {
            for (int j = 0; j < 12; j++) {
                counter+= matrix_wages[i][j];  //Sum every row by every column;¿
                if ( highest < matrix_wages[i][j] ){
                    highest=matrix_wages[i][j];
                    employee_column=j;
                }
            }
        }
        average= counter/(rows*12);
        System.out.println("The total that the enterprise has paid is: "+counter+", The average wage is: "+average+", The employee who got the highest wage is: "+(employee_column+1)+", with: "+highest);

    }

    public static int f_menu_N_employees() {
        //DESCRIPTION: This method displays the menu and returns the number of employees
        System.out.println(".......................");
        System.out.println(".   SoftSmartPeople   .");
        System.out.println(".   V1.0 26/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the number of employees");
        int total_employees = keyboard.nextInt();
        while (total_employees <= 0) {
            System.out.println("ERR: The value must be greater than 0");
            System.out.println("Input again the number of employees");
            total_employees = keyboard.nextInt();
        }
        return total_employees;
    }

    public static void f_fill_matrix(int[][] matrix_wages) {
        //DESCRIPTION: This method fills the matrix
        for (int i = 0; i < matrix_wages.length; i++) {
            for (int j = 0; j < matrix_wages[0].length; j++) {
                matrix_wages[i][j] = (int) Math.floor((Math.random() * (4439015-877803+1))+877803);
            }
        }
    }

}

