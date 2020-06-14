package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_scholarships_and_discounts extends JFrame {
    public JTextField text_code, text_sede, text_facultad, text_valor;

    public form_scholarships_and_discounts() {
        setLayout(new BorderLayout());
        JLabel label_menu = new JLabel("Scholarships and discounts", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        JPanel panel_superior = new JPanel();
        panel_superior.add(label_menu);
        add(panel_superior, BorderLayout.NORTH);

        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(6, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Código: "));
        panel_central.add(text_code = new JTextField(""));
        panel_central.add(new JLabel("Sede: "));
        panel_central.add(text_sede = new JTextField(""));
        panel_central.add(new JLabel("Facultad: "));
        panel_central.add(text_facultad = new JTextField(""));
        panel_central.add(new JLabel("Valor: "));
        panel_central.add(text_valor = new JTextField(""));

        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Guardar la infromación en un archivo
                f_crear_nueva_beca(actionEvent);
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

    public void f_crear_nueva_beca(java.awt.event.ActionEvent e) {
        //Description: This method saves the data into a file
        final JDialog ventana_emergente = new JDialog(this, "Save Data", true);
        if (text_code.getText().length() < 3) {
            ventana_emergente.add(new JLabel("El campo <<code>> debe tener por lo menos 3 caracteres"));
        } else if (text_sede.getText().length() < 5) {
            ventana_emergente.add(new JLabel("El campo <<sede>> debe tener por lo menos 5 dígitos"));
        } else if (text_facultad.getText().length() < 10) {
            ventana_emergente.add(new JLabel("El campo <<facultad>> debe tener por lo menos 10 dígitos"));
        } else if (isNumeric(text_valor.getText()) == false) {
            ventana_emergente.add(new JLabel("El campo <<valor>> debe tener únicamente datos numéricos"));
        } else {
            //Grabar en un archivo la informacion
            file_data_scholarships file_data_scholarships1 = new file_data_scholarships();
            boolean rpta = file_data_scholarships1.f_add_scholarship(text_code.getText(), text_sede.getText(), text_facultad.getText(), text_valor.getText());
            if (rpta == true) {
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_code.setText("");
                text_sede.setText("");
                text_facultad.setText("");
                text_valor.setText("");
            } else {
                ventana_emergente.add(new JLabel("Los datos no se pueden guardar en C:/PRUEBA/scholarships.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
        public static boolean isNumeric(String text_valor){
            boolean resultado;
            try {
                Integer.parseInt(text_valor);
                resultado = true;
            } catch (NumberFormatException excepcion) {
                resultado = false;
            }
            return resultado;
        }
    }



