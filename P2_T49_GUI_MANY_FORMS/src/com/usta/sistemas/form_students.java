package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_students extends JFrame {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 09/06/2020
    //DESCRIPTION: This class creates the form students
    public JTextField text_name, text_lastname, text_faculty;

    public form_students() {
        setLayout(new BorderLayout());
        //Panel superior
        JLabel label_menu = new JLabel("New Student", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        JPanel panel_superior = new JPanel();
        panel_superior.add(label_menu);
        add(panel_superior, BorderLayout.NORTH);

        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("Last name: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("Faculty: "));
        panel_central.add(text_faculty = new JTextField());
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Guardar la infromación eun un archivo
                f_crear_nuevo_estudiante(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);

    }
    public void f_crear_nuevo_estudiante(java.awt.event.ActionEvent evt){
        //Description: This method saves the data into a file
        final JDialog ventana_emergente = new JDialog(this, "Save Data", true);
        if (text_name.getText().length()<3 || text_lastname.getText().length()<3 || text_faculty.getText().length()<3){
            ventana_emergente.add(new JLabel("Todos los campos deben tener mínimo 3 caracteres"));
        }else {
            //Grabar en un archivo la informacion
            file_data_student file_data_student1 = new file_data_student();
            boolean rpta = file_data_student1.f_add_student(text_name.getText(), text_lastname.getText(), text_faculty.getText());
            if (rpta==true){
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
            }else {
                ventana_emergente.add(new JLabel("Los daots no se pueden guardar en C:/PRUEBA/students.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}
