package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 21/04/2020
        //DESCRIPTION: This software calculates the average salary, the total salary and the highest salary.
        f_menu();
        int N = f_number_employees();
        double highest_salary = 0, total_salary = 0, average_salary, salary_employee;
        for (int i = 1; i <= N; i = i + 1) {
            salary_employee = f_salary(i);
            total_salary = total_salary + salary_employee;
            if (highest_salary < salary_employee){
                highest_salary = salary_employee;
            }
        }
        average_salary = total_salary/N;
        System.out.println("The total salary is: "+total_salary+" ,The highest salary is: "+highest_salary+" and the average salary is: "+average_salary);
    }

    public static void f_menu() {
        System.out.println(".......................");
        System.out.println(".      SoftSalary     .");
        System.out.println(".   V1.0 21/04/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
    }

    public static int f_number_employees() {
        //DESCRIPTION: This method returns the number of employees
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of employees");
        int employees = keyboard.nextInt();
        while (employees < 1) {
            System.err.println("ERR: The value must be grater than zero");
            System.out.println("Input again the number of employees");
            employees = keyboard.nextInt();
        }
        return employees;
    }

    public static double f_salary(int i) {
        //DESCRIPTION: This method returns the salary of one employee.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the wage of the " + i + "employee");
        double wage = keyboard.nextDouble();
        while (wage < 1) {
            System.err.println("ERR: The value must be grater than 0");
            System.out.println("Input again the wage of the " + i + "employee");
            wage = keyboard.nextDouble();
        }
        System.out.println("Input the days worked: ");
        double days = keyboard.nextDouble();
        while (days < 1 || days > 30) {
            System.err.println("ERR: The value must be between 1 and 30");
            System.out.println("Input again the days worked: ");
            days = keyboard.nextDouble();
        }
        double salary = wage / 30 * days;
        return salary;
    }
}
