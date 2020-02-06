package interfaz_grafica;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class Circulo extends Punto {

    static final double PI = 3.1416;
    int radio;
    double area;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int x, int y) {
        super(x, y);
    }

    public void Circulo() {

        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Radio", "Círculo", 1));

        this.radio = dato;

    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + this.radio + '}';
    }

    public void paint(Graphics g) {

        g.setColor(Color.GREEN);
        g.drawOval(getX(), getY(), this.radio, this.radio);

    }

    public double Area() {

        area = PI * this.radio * this.radio;

        return area;
    }

}
