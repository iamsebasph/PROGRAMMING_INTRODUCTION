package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 07/05/2020
        //DESCRIPTION:This software saves the weights in a Vector skinny and fat f N people
        int total_people = f_menu_total_people();
        double[] vector_weights = f_fill_vector_weights(total_people);
        f_show_malnourished(vector_weights);
        f_show_Skinny(vector_weights);
        f_show_fat(vector_weights);
        f_show_all_weights(vector_weights);
    }
    public static int f_menu_total_people() {
        System.out.println(".......................");
        System.out.println(".    SoftSkinnyFat    .");
        System.out.println(".   V1.0 07/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the total people");
        Scanner keyboard = new Scanner(System.in);
        int total_numbers = keyboard.nextInt();
        while (total_numbers < 0){
            System.err.println("ERR: The number must be greater than 0");
            System.out.println("Input again the total people");
            total_numbers = keyboard.nextInt();
        }
        return total_numbers;
    }
    public static double[] f_fill_vector_weights(int total_people){
        //DESCRIPTION: This method returns the vector with the weights
        double[] vector_weight = new double[total_people];
        for (int i=0;i<total_people;i++){
            vector_weight[i] = (Math.random()*(120-21)+20);
        }
        return vector_weight;
    }
    public static void f_show_malnourished(double[] vector_weights){
        //DESCRIPTION: This method shows the total that are malnourished
        int total_malnourished=0;
        for (double weight: vector_weights){
            if (weight < 40){
                total_malnourished++;
            }
        }
        System.out.println("The total of malnourished people are: "+total_malnourished);
    }
    public static void f_show_Skinny(double[] vector_weights){
        //DESCRIPTION: This method shows the total that are skinny
        int total_Skinny=0;
        for (double weight: vector_weights){
            if (weight >= 40 && weight < 70){
                total_Skinny++;
            }
        }
        System.out.println("The total of skinny people are: "+total_Skinny);
    }
    public static void f_show_fat(double[] vector_weights){
        //DESCRIPTION: This method shows the total that are fat
        int total_fat=0;
        for (double weight: vector_weights){
            if (weight >= 70){
                total_fat++;
            }
        }
        System.out.println("The total of fat people are: "+total_fat);
    }
    public static void f_show_all_weights (double[] vector_weights){
        //DESCRIPTION: This method shows all weights
        for (int i=0;i<vector_weights.length;i++){
            System.out.println("The weight of the person ("+(i+1)+") is: "+vector_weights[i]);
        }
    }
}
