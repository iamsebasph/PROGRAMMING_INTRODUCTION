package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 13/05/2020
        //DESCRIPTION:This software Let USTA learn how students rate food in the Giordano Bruno building cafeteria. For this, a scale of 1 to 10 was defined (1 denotes horrible and 10 denotes excellent). The software will perform a simulation where you randomly generate these grades for a month (20 days) for a number of students (the user will determine how many students will be surveyed).
        int total_students = f_menu_total_students();
        int[][] rate_matrix = f_fill_rates_matrix(total_students);
        f_show_bad_rates(rate_matrix);
        f_show_regular_rates(rate_matrix);
        f_show_excellent_rates(rate_matrix);
    }

    public static int f_menu_total_students() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".    SofRatingFood    .");
        System.out.println(".   V1.0 13/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the number of students that will rate the food: ");
        Scanner keyboard = new Scanner(System.in);
        int students = keyboard.nextInt();
        while (students <= 0) {
            System.err.println("ERR: The number of students must be greater than 0");
            System.out.println("Input again the number of students that will rate the food: ");
            students = keyboard.nextInt();
        }
        return students;
    }
    public static int[][] f_fill_rates_matrix (int total_students){
        //DESCRIPTION: This method returns a matrix with rates of N students
        int[][] matrix = new int[total_students][20];
        for (int i=0;i < total_students;i++){  //Recorrer las filas
            for (int j=0; j<20; j++){
                matrix[i][j]= (int) Math.floor((Math.random()*10)+1);
            }
        }
        return matrix;
    }
    public static void f_show_bad_rates(int[][] rate_matrix){
        //DESCRIPTION: This method shows the bath rates (<=3)
        int total_bad_rates =0;
        for (int e=0; e<rate_matrix.length;e++){
            for (int r=0; r<20;r++){
                if (rate_matrix[e][r] <= 3){
                    total_bad_rates++;
                }
            }
        }
       double percent = (total_bad_rates*100) / (rate_matrix.length*20);
        System.out.println("The total bad grades (<=3): "+total_bad_rates+ " The percentage is %"+percent);
    }
    public static void f_show_regular_rates(int[][] rate_matrix){
        //DESCRIPTION: This method shows the bath rates (between 4 and 6)
        int total_regular_rates =0;
        for (int e=0; e<rate_matrix.length;e++){
            for (int r=0; r<20;r++){
                if (rate_matrix[e][r] >=4 && rate_matrix[e][r] <=6){
                    total_regular_rates++;
                }
            }
        }
        double percent = (total_regular_rates*100) / (rate_matrix.length*20);
        System.out.println("The total regular grades (between 4 and 6): "+total_regular_rates+ " The percentage is %"+percent);
    }
    public static void f_show_excellent_rates(int[][] rate_matrix){
        //DESCRIPTION: This method shows the bath rates (greater or equal than 7)
        int total_excellent_rates =0;
        for (int e=0; e<rate_matrix.length;e++){
            for (int r=0; r<20;r++){
                if (rate_matrix[e][r] >= 7){
                    total_excellent_rates++;
                }
            }
        }
        double percent = (total_excellent_rates*100) / (rate_matrix.length*20);
        System.out.println("The total bad grades (<=3): "+total_excellent_rates+ " The percentage is %"+percent);
    }
}
