import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

public class clue extends JFrame implements ActionListener {
    //
    private JPanel panelBienvenida = new JPanel();
    private JLabel labelTitulo = new JLabel("Misterios Resueltos. By Agatha Christie"), labelMensaje = new JLabel("Te atreves a jugar?");
    private Font titulo = new Font("Bodoni MT Black", Font.BOLD, 60);
    private JButton buttonTitulo = new JButton("Jugar");
    private HashMap<Integer, String> HMasesino = new HashMap<>();
    private HashMap<Integer, String> HMarma = new HashMap<>();
    private HashMap<Integer, String> HMlugar = new HashMap<>();

    public clue(){
        // ------------------ Frame ------------------
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clue");
        setSize(1550, 838);
        setExtendedState(MAXIMIZED_BOTH);

        // ------------------ HashMap Asesino ------------------
        HMasesino.put(1, "Dr. Daniel Plum");
        HMasesino.put(2, "Mrs. Amelia Scarlet");
        HMasesino.put(3, "Cnel. Henry Mustard");
        HMasesino.put(4, "Prof. Olive Green");
        HMasesino.put(5, "Mr. Victor White");

        // ------------------ HashMap Arma ------------------
        HMarma.put(1, "Candelabro");
        HMarma.put(2, "Cuchillo");
        HMarma.put(3, "Cuerda");
        HMarma.put(4, "Revolver");
        HMarma.put(5, "Veneno");

        // ------------------ HashMap Lugar ------------------
        HMlugar.put(1, "Salon Principal");
        HMlugar.put(2, "Biblioteca");
        HMlugar.put(3, "Invernadero");
        HMlugar.put(4, "Comedor");
        HMlugar.put(5, "Vestibulo");

        // ------------------ Pantalla Titulo ------------------
        panelBienvenida.setLayout(null);
        panelBienvenida.setBounds(-5, 0,1550, 838);
        panelBienvenida.setBackground(Color.orange);
        panelBienvenida.setVisible(true);
        add(panelBienvenida);

        labelTitulo.setBounds(50, 20, 1450, 100);
        labelTitulo.setFont(titulo);
        panelBienvenida.add(labelTitulo);

        labelMensaje.setBounds(50, 100, 200, 50);
        generaHistoria();
        panelBienvenida.add(labelMensaje);

        buttonTitulo.setBounds(750, 400, 75, 50);
        panelBienvenida.add(buttonTitulo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        clue juego = new clue();
        juego.setVisible(true);
    }

    void generaHistoria(){
        String asesino, arma, lugar;
        respuesta respuestaCorrecta = new respuesta();
        Random rand = new Random();
        int numeroAleatorio1 = rand.nextInt(5) + 1;
        int numeroAleatorio2 = rand.nextInt(5) + 1;
        int numeroAleatorio3 = rand.nextInt(5) + 1;
        labelMensaje.setText(HMasesino.get(numeroAleatorio1) + ", " + HMarma.get(numeroAleatorio2)  + ", " + HMlugar.get(numeroAleatorio3));
        respuestaCorrecta.setAsesino(HMasesino.get(numeroAleatorio1));
        respuestaCorrecta.setArma(HMarma.get(numeroAleatorio2));
        respuestaCorrecta.setLugar(HMlugar.get(numeroAleatorio3));

    }
}