package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 12/05/2020
        //DESCRIPTION:This software sotre in a matricx the number of students (10) and generates notes for the 4 periods
        f_menu();
        double[][] grades = f_fill_matrix();
        f_show_final_grades(grades);
    }

    public static void f_menu() {
        //DESCRIPTION: This method shows the menu
        System.out.println(".......................");
        System.out.println(".  SoftGradeStudetns  .");
        System.out.println(".   V1.0 12/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static double[][] f_fill_matrix() {
        //DESCRIPTION: This method returns the filled matrix (10x4)
        double[][] matrix = new double[10][4];
        for (int i = 0; i < 10; i++) {
            matrix[i][0] = Math.floor((Math.random() * 5) + 1);
            matrix[i][1] = Math.floor((Math.random() * 5) + 1);
            matrix[i][2]= Math.floor((Math.random()*5)+1);
            matrix[i][3]= Math.floor((Math.random()*5)+1);
        }
        return matrix;
    }
    public static void f_show_final_grades(double[][] matrix_grades){
        //DESCRIPTION: This method shows the final grades
        double final_grade=0;
        for (int i=0; i<10;i++){
            final_grade = matrix_grades[i][0]*0.2+matrix_grades[i][1]*0.25+matrix_grades[i][2]*0.25+matrix_grades[i][3]*0.30;
            System.out.println("Student ("+(i+1)+"), grade 1:"+matrix_grades[1][0]+" grade 2: "+matrix_grades[i][1]+
                    ", grade 3: "+matrix_grades[i][2]+ " grade 4: "+matrix_grades[i][3]+":: The final grade is: "+final_grade);
        }
    }
}
