package com.usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 26/03/2020
        //DESCRIPTION: This software realizes many operations with strings
        Scanner keyboard= new Scanner(System.in);
        String name;
        System.out.println("----------------------------------");
        System.out.println("             STRINGSOFT");
        System.out.println("...................................");
        System.out.println("Input your name please: ");
        name = keyboard.nextLine();
        if (name.indexOf("gomez")!= -1){
            System.out.println("Gomez already exists");
        }else{
            System.out.println("Gomez doesn´t exist");
        }
        System.out.println("The Upper name is "+ name.toUpperCase());
        System.out.println(name.replace("a", "@"));
        System.out.println(name.substring(7));
    }
}
