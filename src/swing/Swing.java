package swing;

import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener{

    private JTextField camporellenable;
    private JTextArea campo2;
    private JLabel etiqueta;
    private JButton boton;

    public Swing(){
        setLayout(null);

        // Texto
        etiqueta = new JLabel("Poner Titulo:");
        etiqueta.setBounds(10,10,150,20);
        add(etiqueta);


        // Entrada de Usuario
        camporellenable = new JTextField();
        camporellenable.setBounds(150,10,150,20);
        add(camporellenable);

        // Text Area
        campo2 = new JTextArea();
        campo2.setBounds(10,40,300,50);
        add(campo2);

        // Boton
        boton = new JButton("Cambiar");
        boton.setBounds(10,120,100,30);
        add(boton);
        boton.addActionListener(this);




    }

    // Metodo que utiliza el boton
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton){
            String titulo = camporellenable.getText();
            setTitle(titulo);
        }

    }


    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        ventana1.setBounds(10,10, 400, 300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }
}
