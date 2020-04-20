package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 14/04/2020
        //DESCRIPTION: This program calculates the area of a circle, square or triangle
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int opt = keyboard.nextInt();
        if (opt < 1 || opt > 3){
            System.err.println("ERR: This option doesn´t exist");
        }else{
            if (opt == 1){
                //Llamar la funcion de area de circulo
                f_area_circle();
            }else if (opt == 2){
//llamar la funcion cuadrado
                f_area_square();
            }else{
                //Llamar la funcion triangulo
                f_area_triangle();
            }
        }
    }
    public static void f_menu(){
        System.out.println("...................");
        System.out.println(".SoftAreaFigures  .");
        System.out.println(".   Version 1.0   .");
        System.out.println(".Created by: Sebas.");
        System.out.println("...................");
        System.out.println("Input the option of the figure: \n1-circle\n2-square\n3-triangle");

    }
    public static void f_area_circle (){
        //This method calculates the area of the circle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("For calculating the area of the circle it is necessary the radius, input this value (cm)");
        double radius = keyboard.nextDouble();
        double area = (radius*radius)*3.141516;
        System.out.println("The area of the circle is "+area+"cm");
    }
    public static void f_area_square (){
        //This method calculates the area of the square
        Scanner keyboard = new Scanner(System.in);
        System.out.println("For calculating the area of the square it is necessary the side, input this value (cm)");
        double side = keyboard.nextDouble();
        double area = (side*side);
        System.out.println("The area of the square is: "+area+"cm");
    }
    public static void f_area_triangle (){
        //This method calculates the area of the triangle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("For calculating the area of the triangle it is necessary the height and the base, input the value base (cm)");
        double base = keyboard.nextDouble();
        System.out.println("Input the height");
        double height = keyboard.nextDouble();
        double area = (base*height)/2;
        System.out.println("The area of the triangle is: "+area+"cm");
    }
}
