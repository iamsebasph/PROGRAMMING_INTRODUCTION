package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal() {
        super("Software de prueba");
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //Panel izquierdo, donde van a estar los botones
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5, 1));
        //Creamos el primer boton
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_students form_students1 = new form_students();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        JButton boton_formulario2 = new JButton("List all Students");
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        JButton boton_formulario3 = new JButton("New Scholarship or discount");
        boton_formulario3.setBounds(0, 0, 100, 30);
        boton_formulario3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_scholarships_and_discounts form_scholarships_and_discounts1 = new form_scholarships_and_discounts();
            }
        });
        panel_izquierdo.add(boton_formulario3);
        JButton boton_formulario4 = new JButton("List all discounts");
        boton_formulario4.setBounds(0, 0, 100, 30);
        boton_formulario4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_scholarships(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario4);
        JButton boto_acerca_de = new JButton("Acerca de");
        boto_acerca_de.setBounds(0, 0, 100, 30);
        boto_acerca_de.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acerca_de acerca_de1 = new form_acerca_de();
            }
        });
        panel_izquierdo.add(boto_acerca_de);
        //Creamos el panel inferior.
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por Sebastian Perez"));
        //Agregar los paneles al formulario o (jFrame)
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);

        //Agregar las propiedades del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);


    }

    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt) {
        form_show_all_students form_show_all_students1 = new form_show_all_students(this);
    }
    private void f_abrir_form_show_all_scholarships(java.awt.event.ActionEvent e){
        form_show_all_scholarships form_show_all_scholarships1 = new form_show_all_scholarships(this);
    }
}
