package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR: Sebastián Pérez Hernández
        //DATE: 30/03/2020
        //DESCRIPTION: This program generates a menu, and make operations with strings
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║StringsSoft USTA 2020                 ║");
        System.out.println("║Versión 1.0                           ║");
        System.out.println("║Creado por: Sebastián Pérez Hernández ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("Input your name please:");
        name = keyboard.nextLine();
        if (name.length() < 6) {
            System.err.println("ERROR: El nombre es muy corto, debe ingresar el nombre completo (nombre y apellidos)");
        } else {
            if (name.length() > 20) {
                System.err.println("ERROR: El nombre es demasiado largo, sólo debe ingresar su nombre completo (nombre y apellidos)");
            } else {
                System.out.println("Su nombre es: " + name);
                System.out.println("Los cambios son: " + name.replace("a", "@").replace("e", "3").replace("i", "1").replace("o", "0").replace("E", "3").replace("A", "@").replace("I", "1").replace("O", "0"));
            }
        }
    }
}
