package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_students extends JDialog {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 09/06/2020
    //DESCRIPTION: This class shows the data of a file C:/PRUEBA/students.txt
    public form_show_all_students(java.awt.Frame parents) {
        super(parents, true);
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of students", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel central
        String[] columnsNames = {"Name", "Last Name", "Faculty"};
        file_data_student file_data_student1 = new file_data_student();
        JTable tabla_datos = new JTable(file_data_student1.f_all_data_students(), columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        //Añadir los dos paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //Parametros generales del formulario
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();//modal


    }
}
