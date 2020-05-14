package com.usta.sistemas;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //AUTHOR:Sebastián Pérez Hernández
        //DATE: 14/05/2020
        //DESCRIPTION:This software replace all the vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157), u = ⌂ (alt +127)
        //Convert all words to uppercase.
        f_menu();
        String[][] matrix_names = {{"maria", "pedro", "JOSE", "camilo", "rodrigo"},
                {"Ana", "Lucia", "Martha", "Juliana", "Patricia"},
                {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
        matrix_names = f_replace_vowels(matrix_names);
        System.out.println("-------------show matrix-------------");
        for (int i=0; i<matrix_names.length;i++){ //Recorrer las filas
            System.out.print("\n ("+(i+1)+")=");
            for (int j=0; j<matrix_names[0].length;j++){
                System.out.print(" | "+matrix_names[i][j]+" ");
            }
        }
    }

    public static void f_menu() {
        //DESCRIPTION: This method displays the menu
        System.out.println(".......................");
        System.out.println(".   SofConvertWord    .");
        System.out.println(".   V1.0 14/05/2020   .");
        System.out.println(". Created by: SebasP  .");
        System.out.println(".......................");
        System.out.println("This program creates a 4x5 matrix with the people names");

    }

    public static String[][] f_replace_vowels(String[][] matrix_names) {
        //DESCRIPTION: This method replace all the vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157), u = ⌂ (alt +127)
        for (int i = 0; i < matrix_names.length; i++) { //Recorrer las filas
            for (int j = 0; j < 5; j++) { //Recorrer las columnas
                matrix_names[i][j] = matrix_names[i][j].toUpperCase().replace("A", "@").
                        replace("E", "3").replace("I", "1").replace("O", "Ø").
                        replace("U", "⌂");
            }

        }
        return matrix_names;
    }
}
