package swing;

import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener{

    private JLabel etiqueta1, etiqueta2, etiqueta3;
    JButton botonsalida;

    public Swing(){
        setLayout(null);
        etiqueta1 = new JLabel("Mi Programa");
        etiqueta1.setBounds(164,90, 200, 30);
        add(etiqueta1);

        setLayout(null);
        etiqueta2 = new JLabel("version 1.0");
        etiqueta2.setBounds(168,105, 200, 30);
        add(etiqueta2);

        setLayout(null);
        etiqueta3 = new JLabel("Alfredo Bravo Cuero");
        etiqueta3.setBounds(140,120, 200, 30);
        add(etiqueta3);

        botonsalida = new JButton("Salir");
        botonsalida.setBounds(150,220,100, 30);
        add(botonsalida);
        botonsalida.addActionListener(this);


    }

    // Metodo que utiliza el boton para salir
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botonsalida){
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        ventana1.setBounds(10,10, 400, 300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }
}
