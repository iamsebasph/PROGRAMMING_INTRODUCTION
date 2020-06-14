package com.usta.sistemas;

import javax.swing.*;

public class Formulario extends JFrame {
    public Formulario() {
        //Constructor of class
        JLabel label1 = new JLabel("This is my first program");
        //La ubicamos en el formulario
        label1.setBounds(5, 5, 300, 30);
        add(label1);
        //Agregar un boton
        JButton button1 = new JButton("Aceptar");
        button1.setBounds(180, 180, 100, 50 );
        add(button1);
        setLayout(null); //Ubicar formulario en el centro de la pantalla
        setVisible(true);
        setBounds(0, 0, 400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // write your code here
       // Formulario formulario1 = new Formulario();
        Formulario2 formulario2 = new Formulario2();
    }
}
