package poolgame;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x;
    private int y;
    private int radius;
    private Color color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Ball(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.radius = 15; // El tamaño de la bola (ajusta según tus necesidades)
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void move() {
        // Implementa la lógica de movimiento de la bola aquí
    }

    // Puedes agregar más métodos y propiedades según sea necesario
}
