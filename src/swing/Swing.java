package swing;

import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener, ItemListener{

    private JTextField camporellenable;
    private JTextArea campo2;
    private JLabel etiqueta;
    private JButton boton;
    private JScrollPane scrol1;
    private JComboBox combo1;

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
        scrol1 = new JScrollPane(campo2);
        scrol1.setBounds(10,40,300,50);
        add(scrol1);

        // Combo
        combo1 = new JComboBox();
        combo1.setBounds(10,90,150,50);
        add(combo1);
        combo1.addItem("Rojo");
        combo1.addItem("verde");
        combo1.addItem("Azul");
        combo1.addItemListener(this);

        // Boton
        boton = new JButton("Cambiar");
        boton.setBounds(10,160,100,30);
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
    // Metodo que utiliza el combo
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccionado = (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }

    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        ventana1.setBounds(10,10, 400, 300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }


}

