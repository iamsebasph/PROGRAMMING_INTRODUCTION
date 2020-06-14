package com.usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_scholarships {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 18/06/2020
    //DESCRIPTION: This class creates and show the data of a file C:/PRUEBA/scholarships.txt
    public static boolean f_add_scholarship(String p_code, String p_sede, String p_facultad, String p_valor){
        //DESCRIPTION: This method creates a new line into a file C:/PRUEBA/scholarships.txt
        boolean result;
        try {
            File Myfile = new File("C:/PRUEBA/scholarships.txt");
            if (Myfile.exists()){
                //Instanciar el archivo con true para agregar nuevas lineas
                FileWriter Myfile2 = new FileWriter(Myfile, true);
                //Cargar la data del archivo en memoria
                BufferedWriter dataMyfile = new BufferedWriter(Myfile2);
                dataMyfile.write("\n"+p_code+"|"+p_sede+"|"+p_facultad+"|"+p_valor);
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
    public static String[][] f_all_data_scholarships(){
        //DESCRIPTION: This method returns all data of the file C:/PRUEBA/scholarships.txt
        String[][] matrix_scholarships;
        String line_texto, linea_tmp, linea_tmp2;
        int rows =0, total_lines=0, separador1, separador2, separador3;
        try {
            File Myfile = new File("C:/PRUEBA/scholarships.txt");
            if (Myfile.exists()){
                Scanner Myfile2 = new Scanner(Myfile);
                while (Myfile2.hasNextLine()){
                    total_lines++;
                    Myfile2.nextLine();
                }
                Myfile2.close();
                Myfile2=null;
                matrix_scholarships= new String[total_lines][4];
                Myfile2 = new Scanner(Myfile);
                while (Myfile2.hasNextLine()){
                    line_texto=Myfile2.nextLine();
                    separador1= line_texto.indexOf("|");
                    if (separador1!=-1) { //Garantizamos que la linea tenga datos
                        matrix_scholarships[rows][0] = line_texto.substring(0, separador1);  //Extraigo el nimbre del estudiante
                        linea_tmp = line_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_scholarships[rows][1] = linea_tmp.substring(0, separador2);
                        linea_tmp2 = linea_tmp.substring(separador2+1);
                        separador3 = linea_tmp2.indexOf("|");
                        matrix_scholarships[rows][2] = linea_tmp2.substring(0, separador3);
                        matrix_scholarships[rows][3] = linea_tmp2.substring(separador3+1);
                        rows++;
                    }
                }
                Myfile2.close();
                return matrix_scholarships;
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


