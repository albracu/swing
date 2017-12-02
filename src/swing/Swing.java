package swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Swing extends JFrame implements ActionListener, ItemListener, ChangeListener{

    private JTextField camporellenable;
    private JTextArea campo2;
    private JLabel etiqueta;
    private JButton boton;
    private JScrollPane scrol1;
    private JComboBox combo1;

    // Atributos del Menu
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;

    // Checkbox
    private JCheckBox check1, check2, check3;

    // Radio Button
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupobotones;

    public Swing(){
        setLayout(null);

        // Menu
        barra = new JMenuBar();
        setJMenuBar(barra);

        menu1 = new JMenu("Archivo");
        barra.add(menu1);

        mi1 = new JMenuItem("Nuevo");
        mi1.addActionListener(this);
        menu1.add(mi1);

        mi2 = new JMenuItem("Abrir");
        mi2.addActionListener(this);
        menu1.add(mi2);

        mi3 = new JMenuItem("Guardar");
        mi3.addActionListener(this);
        menu1.add(mi3);

        // Texto
        etiqueta = new JLabel("Poner Texto a Titulo:");
        etiqueta.setBounds(10,10,150,20);
        add(etiqueta);

        // Entrada de Usuario
        camporellenable = new JTextField();
        camporellenable.setBounds(150,10,160,20);
        add(camporellenable);

        // Boton
        boton = new JButton("Cambiar Texto");
        boton.setBounds(75,30,150,30);
        add(boton);
        boton.addActionListener(this);


        // Text Area
        campo2 = new JTextArea();
        scrol1 = new JScrollPane(campo2);
        scrol1.setBounds(10,65,300,50);
        add(scrol1);

        // Combo
        combo1 = new JComboBox();
        combo1.setBounds(10,110,150,50);
        add(combo1);
        combo1.addItem("Rojo");
        combo1.addItem("verde");
        combo1.addItem("Azul");
        combo1.addItemListener(this);

        // CheckBox
        check1 = new JCheckBox("Cali");
        check1.setBounds(10,150,150,30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("Bogota");
        check2.setBounds(10,170,150,30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Medellin");
        check3.setBounds(10,190,150,30);
        check3.addChangeListener(this);
        add(check3);

        // Radio Button
        grupobotones = new ButtonGroup();
        radio1 = new JRadioButton("640x480");
        radio1.setBounds(150,150,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupobotones.add(radio1);

        radio2 = new JRadioButton("800x600");
        radio2.setBounds(150,170,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupobotones.add(radio2);

        radio3 = new JRadioButton("1024x768");
        radio3.setBounds(150,190,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupobotones.add(radio3);



    }

    // Metodo que utiliza el boton
    public void actionPerformed(ActionEvent e){
        Container f = this.getContentPane();

        if (e.getSource()==boton){
            String titulo = camporellenable.getText();
            setTitle(titulo);
        }

        if (e.getSource()==mi1) {
            f.setBackground(new Color(255,0,0));
        }

        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }

        if (e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }

    }

    // Metodo que utiliza el combo
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccionado = (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }

    // Metodo que utiliza el CheckBox y Radio Button
    public void stateChanged(ChangeEvent e) {
        String titulo = "";
        if (check1.isSelected()== true) {
            titulo = titulo + "Cali";
        }

        if (check2.isSelected()== true) {
            titulo = titulo + "Bogota";
        }

        if (check3.isSelected()== true) {
            titulo = titulo + "Medellin";
        }

        if (radio1.isSelected()) {
            setSize(640, 480);
        }

        if (radio2.isSelected()) {
            setSize(800, 600);
        }

        if (radio3.isSelected()) {
            setSize(1024, 768);
        }

        setTitle(titulo);
    }


    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        ventana1.setBounds(10,10, 320, 300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }

}

