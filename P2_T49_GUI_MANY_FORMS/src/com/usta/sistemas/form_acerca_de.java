package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_acerca_de extends JFrame {
    //AUTHOR: Sebastian Perez Hernandez
    //DATE: 09/06/2020
    //DESCRIPTION: This class creates the form acerca de
    public form_acerca_de(){
        setLayout(new BorderLayout());
        //Panel superior
        JLabel label_menu = new JLabel("ACERCA DE", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        JPanel panel_superior = new JPanel();
        panel_superior.add(label_menu);
        //Panel central
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(10,1));
        JLabel label_random = new JLabel("");
        panel_izquierdo.add(label_random);
        JLabel label_random2 = new JLabel("");
        panel_izquierdo.add(label_random2);
        JLabel label_maker = new JLabel("       This software was made by Sebastian perez Hernandez.", SwingConstants.CENTER);
        panel_izquierdo.add(label_maker);
        JLabel label_facul = new JLabel("       Student of the Systems Engineering faculty");
        panel_izquierdo.add(label_facul);
        JLabel label_uni = new JLabel(  "       Santo Tomás Tunja University");
        panel_izquierdo.add(label_uni);
        JLabel label_mail = new JLabel( "       Email: sebastian.perezh@usantoto.edu.co");
        panel_izquierdo.add(label_mail);
        JLabel label_git = new JLabel(  "       Github: https://github.com/iamsebasph");
        panel_izquierdo.add(label_git);

        JPanel panel_inferior = new JPanel();
        JLabel label1 = new JLabel();
        label1.setSize(100,100);
        ImageIcon image = new ImageIcon("C:/PRUEBA/imagen2.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_DEFAULT));
        label1.setIcon(icon);
        panel_inferior.add(label1);
        add(panel_inferior, BorderLayout.SOUTH);
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo,BorderLayout.WEST );


        //Panel derecho
        JPanel panel_derecho = new JPanel();
        JLabel label = new JLabel();
        label.setSize(170,220);
        ImageIcon image2 = new ImageIcon("C:/PRUEBA/imagen.jpeg");
        Icon icon2 = new ImageIcon(image2.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT));
        label.setIcon(icon2);
        panel_derecho.add(label);
        add(panel_derecho,BorderLayout.EAST);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
    }
}
