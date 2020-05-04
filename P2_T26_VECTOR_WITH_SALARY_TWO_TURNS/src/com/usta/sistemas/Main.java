package com.usta.sistemas;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 04/05/2020
        //DESCRIPTION:This software allows storing tha salary of the employees grouped by shift
        f_menu();
        int[] turn_morning = f_salary_turn(); //This vector is for morning turn (8 employees)
        int[] turn_afternoon = f_salary_turn(); //This Vector is for afternoon turn (8 employees)
        int salary_total_morning = f_show_salary_morning(turn_morning);
        int salary_total_afternoon = f_show_salary_afternoon(turn_afternoon);
        System.out.println("The total salary (morning + afternoon) is: "+(salary_total_afternoon+salary_total_morning));
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(". SoftTwoVectorSalary .");
        System.out.println(".   V1.0 04/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int[] f_salary_turn() {
        //DESCRIPTION: This method returns the salary of 8 employees
        int[] salary = new int[8];
        for (int i = 0; i < 8; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 980558 + 1) + 980558);

        }
        return salary;
    }
    public static int f_show_salary_morning (int[] turn_morning){
        //DESCRIPTION: This method shows the salaries of the employees of the morning turn
        System.out.println("----------turn of morning----------");
       int total_salary = 0;
        for (int i=0; i<8; i++){
            total_salary+=turn_morning[i];
            System.out.println("The salary of the employee ("+(i+1)+") :"+turn_morning[i]);
        }
        System.out.println("The total salary of the morning turn is: "+total_salary);
        return total_salary;
    }
    public static int f_show_salary_afternoon (int[] turn_afternoon){
        //DESCRIPTION: This method shows the salaries of the employees of the afternoon turn
        System.out.println("----------turn of afternoon----------");
        int total_salary = 0;
        for (int i=0; i<8; i++){
            total_salary+=turn_afternoon[i];
            System.out.println("The salary of the employee ("+(i+1)+") :"+turn_afternoon[i]);
        }
        System.out.println("The total salary of the afternoon turn is: "+total_salary);
        return total_salary;
    }
}
