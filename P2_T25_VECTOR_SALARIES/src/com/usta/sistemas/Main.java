package com.usta.sistemas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 29/04/2020
        //DESCRIPTION:This software saves the salary of 5 employees using an arrangement, where the salaries are random value between $1000000 and $2000000
        f_menu();
        int [] salary_of_employees = f_sueldos();
        f_show_sueldos(salary_of_employees);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftVector     .");
        System.out.println(".   V1.0 04/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int[] f_sueldos() {
        //DESCRIPTION: This method returns a vector with salary of five employees
        Random random = new Random();
        int[] sueldos = new int[5]; // This var saves the salaries
        for (int i = 0; i < 5; i++) {
            sueldos[i] = (int)Math.floor(Math.random()*(2000000-1000000+1)+1000000);//Math.round(random.nextInt()*((2000000-1000000)+1)+1000000);
        }
        return sueldos;
    }
    public static void f_show_sueldos(int[] salary){
        //DESCRIPTION: This method shows the vector with the salary
        System.out.println("--------The list of salaries is:--------");
        for (int i = 0; i < 5; i++){
            System.out.println("The salary of the employee ("+(i+1)+")is: "+salary[i]);
        }
    }
}
