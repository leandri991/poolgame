package poolgame;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PoolTable extends JPanel implements ActionListener, KeyListener {

    private Ball whiteBall;
    private CueStick cueStick;

    public PoolTable() {
        setFocusable(true);
        addKeyListener(this);

        whiteBall = new Ball(50, 300, Color.WHITE);
        cueStick = new CueStick(whiteBall);

        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja el tablero y las bolas aquí
        whiteBall.draw(g);
        cueStick.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Actualiza la lógica del juego aquí
        whiteBall.move();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Maneja las teclas para controlar el palo de billar aquí
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            cueStick.rotateLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            cueStick.rotateRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Puedes agregar más manejo de eventos de teclado si es necesario
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Puedes agregar más manejo de eventos de teclado si es necesario
    }
}
