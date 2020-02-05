package interfaz_grafica;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SISTEMAS
 */
public class Circulo extends Punto {
    
    private int radio;
    
    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public Circulo() {
        super();
    }
    
    public int getRadio() {
        return radio;
    }
    
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void dibujo(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(super.getX(), super.getY(), this.radio, this.radio);
    }
    
    public String toString() {
        return super.toString();
    }
}
