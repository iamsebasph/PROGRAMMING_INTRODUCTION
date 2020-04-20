package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Author: Sebastián Pérez Hernández
        //Date: 19/03/2020
        //Description: This software generates a bill of supermarket paradise
        System.out.println("Bill software of supermarket paradise, input the first product:");
        Scanner keyboard = new Scanner(System.in);
        int prod1, prod2, prod3, prod4, total_bruto;
        double IVA, TOTAL;
        prod1= keyboard.nextInt();
        System.out.println("Input second product:");
        prod2= keyboard.nextInt();
        System.out.println("Input third product:");
        prod3= keyboard.nextInt();
        System.out.println("Input fourth product:");
        prod4= keyboard.nextInt();
        total_bruto=prod1+prod2+prod3+prod4;
        IVA= total_bruto*0.19;
        TOTAL= total_bruto+IVA;
        System.out.println("Your bill is:");
        System.out.println("Total bruto:"+total_bruto);
        System.out.println("IVA:$"+IVA);
        System.out.println("Total factura:$"+TOTAL);
    }
}
