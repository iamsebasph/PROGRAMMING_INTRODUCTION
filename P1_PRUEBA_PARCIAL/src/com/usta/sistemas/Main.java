package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: Sebastian Perez Hernandez
        //DATE: 31/02/2020
        Scanner keyboard = new Scanner(System.in);
        System.out.println("...............................");
        System.out.println(".    STRINGSOFT USTA 2020     .");
        System.out.println(".    VERSIÓN 1.0              .");
        System.out.println(".    CREADO POR: Sebastián    .");
        System.out.println("...............................");
        System.out.println("Input your name please");
        String name, name2;
        name = keyboard.nextLine();
        if (name.length() < 6) {
            System.err.println("ERROR: El nombre es muy corto. Debe tener mínimo 6 caracteres. Ingrese nombres y apellidos");
        } else {
            if (name.length() > 30) {
                System.err.println("ERROR: El nombre es muy largo. Ingrese solo nombres y apellidos");
            } else {
                System.out.println("Su nombre es:" + name);
                System.out.println(name.replace("a", "@").replace("e", "3")
                .replace("i", "1").replace("o", "0").replace("A", "@")
                .replace("E", "3").replace("I", "1").replace("O", "0"));
            }
        }
    }
}
