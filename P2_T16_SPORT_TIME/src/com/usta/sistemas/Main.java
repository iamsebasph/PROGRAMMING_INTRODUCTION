package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 23/04/2020
        //DESCRIPTION:This software records the lap of each lap of training and determines the best lap
        f_menu();
        int total_laps = 0;
        double best_lap=0, average, time_lap, summatory_time=0;
        while (f_continue()==true){
            total_laps+=1;
            time_lap=f_value_lap(total_laps);
            summatory_time+=time_lap;
            if (total_laps==1){
                best_lap=time_lap;
            }else if(best_lap>time_lap){
                best_lap=time_lap;
            }
        }
        average=summatory_time/total_laps;
        System.out.println("The best lap: "+best_lap+", The total of laps: "+total_laps+" average time is: "+average);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftSport      .");
        System.out.println(".   V1.0 23/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static boolean f_continue() {
        //DESCRIPTION: This method returns a boolean value true/false
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to continue the training (true/false)");
        boolean rpta = keyboard.nextBoolean();
        return rpta;
    }
    public static double f_value_lap (int lap){
        //DESCRIPTION: This method returns the time of a lap
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the time ("+lap+") lap: ");
        double time = keyboard.nextDouble();
        while (time < 1){
            System.out.println("ERR: The time must be greater than 0");
            System.out.println("Input again the time ("+lap+") lap: ");
            time = keyboard.nextDouble();
        }
        return time;
    }
}
