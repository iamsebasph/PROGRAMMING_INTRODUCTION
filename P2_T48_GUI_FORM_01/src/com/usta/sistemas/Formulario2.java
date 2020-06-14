package com.usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Formulario2 extends JFrame {
    public Formulario2(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        for (int i = 1; i <= 10; i++){
            add(new JButton("Componente " + i));
        }
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
