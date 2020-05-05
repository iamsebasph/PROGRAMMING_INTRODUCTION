package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 05/05/2020
        //DESCRIPTION:This software generates the age randomly for N people and save them in a vector
        int total_people = f_menu();
        int[] age_people = f_age_of_people(total_people);
        f_shows_ages(age_people);
        f_shows_over_60(age_people);
        f_show_average_age(age_people);
    }

    public static int f_menu() {
        System.out.println(".......................");
        System.out.println(".     SoftVectorAge  .");
        System.out.println(".   V1.0 05/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("Input the number of total people");
        Scanner keyboard = new Scanner(System.in);
        int N_people = keyboard.nextInt();
        while (N_people <= 0) {
            System.err.println("ERR: The number of total people must be greater than 0");
            System.out.println("Input again the number of total people");
            N_people = keyboard.nextInt();
        }
        return N_people;
    }

    public static int[] f_age_of_people(int total_people) {
//DESCRIPTION: This meyhod returns a Vector with the age of N people
        int[] age_people = new int[total_people];
        for (int i=0; i < total_people; i++){
           age_people[i] = (int) Math.floor(Math.random() * (80) +1);
        }
        return age_people;
    }
    public static void f_shows_ages (int[] age_people){
        //This method shows how many are over 18 years old and the ones that are under
        int total_people = age_people.length;
        int total_over_18=0, total_under_18=0;
        for (int i=0; i<total_people;i++){
            System.out.println(age_people[i]);
            if (age_people[i]< 18){
                total_under_18++;
            }else{
                total_over_18++;
            }
        }
        System.out.println("The total people under 18 are: "+total_under_18+", the total people over 18 are: "+total_over_18);
    }
    public static void f_shows_over_60 (int[] age_people){
        //This method shows how many are over 18 years old and the ones that are under
        int total_people = age_people.length;
        int total_over_60=0;
        for (int i=0; i<total_people;i++){
            System.out.println(age_people[i]);
            if (age_people[i]>60){
                total_over_60++;
            }
        }
        System.out.println( "the total people over 60 are: "+total_over_60);
    }
    public static void f_show_average_age (int[] age_people){
        //DESCRIPTION: This method shows the average age
        int sum_age =0;
        for (int i=0;i<age_people.length;i++){
            sum_age= sum_age+age_people[i];
        }
        double average = sum_age/age_people.length;
        System.out.println("The average is: "+average);
    }

}
