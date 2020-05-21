package com.usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        if (a == b && b == c && c == a) {
            System.out.println(a + " " + b + " " + c);
            a=-1;
            b=-2;
            c=-5;
        }
        if (a == b) {
            System.out.println(a + " " + b);
        }
        if (b == c) {
            System.out.println(b + " " + c);
        }
        if (c == a) {
            System.out.println(c + " " + a);
        }

    }
}
