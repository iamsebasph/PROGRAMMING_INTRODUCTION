package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 12/05/2020
        //DESCRIPTION:This software simulates the data of swimming competition
        int total_competitors = f_menu_competitors();
        double[][] matrix_competition = f_fill_matrix_competition(total_competitors);
        String texto = "";
        System.out.println("----------------The times of competition---------------");
        System.out.println("Player | T1 |T2 | T3 | T4 | T5 |T6 | T7 | T8 | T9 | T10");
        for (int i=0;i<total_competitors;i++){
           // System.out.println(i+1);
            texto+="\n"+(i+1);
            for (int j=0;j<10;j++){
                //System.out.print(" | "+matrix_competition[i][j]+ " ");
                texto+=" | "+matrix_competition[i][j];
            }
        }
        System.out.println(texto);
    }

    public static int f_menu_competitors() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".  SoftSwimmingComp   .");
        System.out.println(".   V1.0 12/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the number of competitors: ");
        Scanner keyboard = new Scanner(System.in);
        int competitors = keyboard.nextInt();
        while (competitors <= 0) {
            System.err.println("ERR: The number of competitors must be greater than 0");
            System.out.println("Input again the number of competitors: ");
            competitors = keyboard.nextInt();
        }
        return competitors;
    }
    public static double[][] f_fill_matrix_competition(int total_competitors){
        //DESCRIPTION: This method returns a filled matrix with the time of competition
        double[][] matrix_competition = new double[total_competitors][10];
        for (int i=0;i<total_competitors;i++){ //Para recorrer las filas (competitors)
            for (int j=0; j<10;j++){ //Para recorrer las columnas (Los 10 tiempos)
                matrix_competition[i][j] = Math.floor((Math.random()*(10-6)+6));
            }
        }
        return matrix_competition;
    }

}
