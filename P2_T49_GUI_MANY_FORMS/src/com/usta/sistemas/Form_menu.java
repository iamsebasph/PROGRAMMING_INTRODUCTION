package com.usta.sistemas;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Form_menu extends JFrame {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 09/06/2020
    //DESCRIPTION: This class displays the menu
//This is a constructor (Se ejecuta cada vez que se llama la clase)
   public  Form_menu(){
       JLabel label1= new JLabel("SOFTWARE DE PRUEBA", SwingConstants.CENTER);
       label1.setBounds(150, 10, 300, 30);
       label1.setFont(new Font("Arial", 0, 20));
       add(label1);
       JLabel label2 = new JLabel("Creado por Sebastian Perez");
       label2.setBounds(5, 300, 595, 20);
       add(label2);
       JButton button1= new JButton("Iniciar");
       button1.setBounds(250, 150, 100, 50);
       //Crear una acciòn para cuando le de click al boton
       button1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               //Aqui va el codigo de lo que se va a hacer
               form_principal form_principal1 = new form_principal();
           }
       });
       add(button1);
       //Propiedades del formulario
       Font font= new Font("Agency FB", Font.BOLD, 14);
       setLayout(null);
       setVisible(true);
       setResizable(false);
       setBounds(0,0, 600, 400);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE); //se active el boton de cerrar
       
   }
}
