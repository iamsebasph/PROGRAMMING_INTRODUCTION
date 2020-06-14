package com.usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File Myfile = new File("C:/PRUEBA/names.txt");
        System.out.println("file.exists(): "+Myfile.exists());
        System.out.println("file.isDirectory(): " + Myfile.isDirectory());
        System.out.println("file.lastModified(): " + Myfile.lastModified());
        System.out.println("file.getName(): " + Myfile.getName());
        System.out.println("file.getPath(): " + Myfile.getPath());
        System.out.println("file.length(): " + Myfile.length()+" bytes");
        System.out.println("file.canRead():" + Myfile.canRead());

        File newfolder = new File("C:/PRUEBA/carpetaconarchivos");
        System.out.println(newfolder.mkdir());

        File carpeta = new File("C:/PRUEBA/carpetaconarchivos");
        System.out.println("----listado archivos C:/carpetaconarchivos------");
        for (String archivo : carpeta.list()) {
            System.out.println(archivo);
        }
        //Agregar una línea nueva a un archivo existente
        try {
            //Abra el archivo en una forma append(agregar nuevos valores)
            FileWriter Myfile2 = new FileWriter("C:/PRUEBA/names.txt", true);
            //Cargar en memoria ram del sistema operativo el contenido del archivo
            BufferedWriter dataFile = new BufferedWriter(Myfile2);
            dataFile.write("nueva linea sin borrar");
            dataFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
