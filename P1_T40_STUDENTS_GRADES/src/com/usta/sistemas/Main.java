package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //Author: Sebastián Pérez Hernández
        //Date: 24/03/2020
        //Description: This program realize calculates the final grades of a student
        Scanner keyboard = new Scanner(System.in);
        double grade1, grade2, grade3, grade4, gradeFinal;
        System.out.println("This software calculates the final grades");
        System.out.println("You need to input the first grade (20%), The grade must be between 0 to 5");
        grade1 = keyboard.nextDouble();
        System.out.println("You need to input the second grade (25%), The grade must be between 0 to 5");
        grade2 = keyboard.nextDouble();
        System.out.println("You need to input the third grade (25%), The grade must be between 0 to 5");
        grade3 = keyboard.nextDouble();
        System.out.println("You need to input the fourth grade (30%), The grade must be between 0 to 5");
        grade4 = keyboard.nextDouble();
        if (grade1 < 0 || grade1 > 5 || grade2 < 0 || grade2 > 5
                || grade3 < 0 || grade3 > 5 || grade4 < 0 || grade4 > 5)
            System.err.println("ERROR: THE GRADES ARE NOT BETWEEN 0 TO 5");
  gradeFinal=(grade1*0.2)+(grade2*0.25)+(grade3*0.25)+(grade4*0.30);
        System.out.println("The final grade is:"+gradeFinal );
    }
}
