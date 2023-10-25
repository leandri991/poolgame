package poolgame;

import java.awt.Color;
import java.awt.Graphics;

public class CueStick {
    private Ball whiteBall;
    private int length;
    private double angle;

    public CueStick(Ball whiteBall) {
        this.whiteBall = whiteBall;
        this.length = 100; // Longitud del palo (ajusta según tus necesidades)
        this.angle = 0; // Ángulo inicial
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(whiteBall.getX(), whiteBall.getY(), getX(), getY());
    }

    public int getX() {
        return whiteBall.getX() + (int) (length * Math.cos(angle));
    }

    public int getY() {
        return whiteBall.getY() + (int) (length * Math.sin(angle));
    }

    public void rotateLeft() {
    	 angle -= Math.toRadians(1); // Gira hacia la izquierda (ajusta el ángulo según tus necesidades)
    }

    public void rotateRight() {
        angle += Math.toRadians(1); // Gira hacia la derecha (ajusta el ángulo según tus necesidades)
    }

    // Puedes agregar más métodos y propiedades según sea necesario
}
