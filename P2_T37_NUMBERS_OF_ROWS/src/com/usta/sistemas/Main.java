package com.usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 19/05/2020
        //DESCRIPTION:This software Fill a two-dimensional array of N x M (values that the user must enter by keyboard), with random numbers between 1 and 1000.
        //Then the software will ask the user to enter a value between 1 to N (number of rows) and the software will display the sum, average, largest and smallest of the numbers that are in that row.
        int rows = f_menu_total_rows();
        int columns = f_total_columns();
        int[][] matrix_numbers = new int[rows][columns]; //The matrix is empty
        matrix_numbers = f_fill_matrix(matrix_numbers);  //Fill the matrix with numbers
        System.out.println("Input the number of row you want");
        int row_number = keyboard.nextInt();
        int summatory =0;
        double average =0;
        while (row_number>=0 && row_number<matrix_numbers.length-1){
            for (int j=0; j<matrix_numbers[0].length;j++){
                System.out.print(" | "+matrix_numbers[row_number][j]);
                summatory+=matrix_numbers[row_number][j];
            }
            average= summatory/matrix_numbers[0].length;
            System.out.println(" For the number row "+row_number+", the summatory is: "+summatory+", and the average is: "+average);
            System.out.println("Input another number of row");
            row_number = keyboard.nextInt();
        }
        System.out.println("Thanks.");
    }

    public static int f_menu_total_rows() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".       SofRows       .");
        System.out.println(".   V1.0 19/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input how many rows you want in the matrix");
        int total_rows = keyboard.nextInt();
        while (total_rows <= 0) {
            System.out.println("ERR: The value must be greater than 0");
            System.out.println("Input again how many rows you want in the matrix");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }

    public static int f_total_columns() {
        //DESCRIPTION: This method returns the total of columns of the matrix
        System.out.println("Input how many columns you want in the matrix");
        int total_columns = keyboard.nextInt();
        while (total_columns <= 0) {
            System.out.println("ERR: The value must be greater than 0");
            System.out.println("Input again how many columns you want in the matrix");
            total_columns = keyboard.nextInt();
        }
        return total_columns;
    }
    public static int[][] f_fill_matrix(int[][] matrix_numbers){
        //DESCRIPTION: This method fills the matrix
        for (int i=0; i<matrix_numbers.length; i++){//To cover the rows
            for (int j=0; j<matrix_numbers[0].length;j++){ //To cover the columns
                matrix_numbers[i][j]= (int) Math.floor((Math.random()*1000)+1); //Math.random()= (0.00 y 0.99)
            }
        }
        return matrix_numbers;
    }
}
