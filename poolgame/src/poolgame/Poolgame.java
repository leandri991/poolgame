package poolgame;

import javax.swing.JFrame;

public class Poolgame extends JFrame {

    public Poolgame() {
        add(new PoolTable()); // Agrega el tablero del juego a la ventana
        setTitle("Juego de Pool");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600); // Ajusta el tamaño de la ventana según tus necesidades
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Poolgame();
    }
}
