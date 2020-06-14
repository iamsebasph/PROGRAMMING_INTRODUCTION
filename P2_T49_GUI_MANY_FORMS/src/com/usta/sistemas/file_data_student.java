package com.usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_student {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 09/06/2020
    //DESCRIPTION: This class creates and show the data of a file C:/PRUEBA/students.txt
    public static boolean f_add_student(String p_name, String p_last_name, String p_faculty){
        //DESCRIPTION: This method creates a new line into a file C:/PRUEBA/students.txt
        boolean result;
        try {
            File Myfile = new File("C:/PRUEBA/students.txt");
            if (Myfile.exists()){
                //Instanciar el archivo con true para agregar nuevas lineas
                FileWriter Myfile2 = new FileWriter(Myfile, true);
                //Cargar la data del archivo en memoria
                BufferedWriter dataMyfile = new BufferedWriter(Myfile2);
                dataMyfile.write("\n"+p_name+"|"+p_last_name+"|"+p_faculty);
                dataMyfile.close();
                result=true;
            }else {
                result=false;

            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    public static String[][] f_all_data_students(){
        //DESCRIPTION: This method returns all data of the file C:/PRUEBA/students.txt
        String[][] matrix_students;
        String line_texto, linea_tmp;
        int rows =0, total_lines=0, separador1, separador2;
        try {
            File Myfile = new File("C:/PRUEBA/students.txt");
            if (Myfile.exists()){
                Scanner Myfile2 = new Scanner(Myfile);
                while (Myfile2.hasNextLine()){
                    total_lines++;
                    Myfile2.nextLine();
                }
                Myfile2.close();
                Myfile2=null;
             matrix_students= new String[total_lines][3];
                Myfile2 = new Scanner(Myfile);
                while (Myfile2.hasNextLine()){
                  line_texto=Myfile2.nextLine();
                  separador1= line_texto.indexOf("|");
                  if (separador1!=-1) { //Garantizamos que la linea tenga datos
                      matrix_students[rows][0] = line_texto.substring(0, separador1);  //Extraigo el nimbre del estudiante
                      linea_tmp = line_texto.substring(separador1 + 1);
                      separador2 = linea_tmp.indexOf("|");
                      matrix_students[rows][1] = linea_tmp.substring(0, separador2);
                      matrix_students[rows][2] = linea_tmp.substring(separador2 + 1);
                      rows++;
                  }
                }
                Myfile2.close();
                return matrix_students;
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
