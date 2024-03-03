import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    private JLabel etiqueta;
    private JTextArea areaTexto;
    private JButton botonHola;
    private JButton botonAdios;

    public Frame() {
        setTitle("Hola");
        setSize(500, 500);
        setLayout(null);

        etiqueta = new JLabel("Nombre:");
        etiqueta.setBounds(20, 20, 100, 30);

        areaTexto = new JTextArea(5, 20);
        areaTexto.setBounds(120, 20, 200, 100);

        botonHola = new JButton("Hola");
        botonHola.setBounds(20, 150, 100, 30);
        botonHola.addActionListener(this);

        botonAdios = new JButton("Adiós");
        botonAdios.setBounds(150, 150, 100, 30);
        botonAdios.addActionListener(this);

        add(etiqueta);
        add(areaTexto);
        add(botonHola);
        add(botonAdios);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonHola) {
            System.out.println("¡Hola, " + areaTexto.getText() + "!");
        } else if (e.getSource() == botonAdios) {
            System.out.println("¡Adiós, " + areaTexto.getText() + "!");
        }
    }
}
