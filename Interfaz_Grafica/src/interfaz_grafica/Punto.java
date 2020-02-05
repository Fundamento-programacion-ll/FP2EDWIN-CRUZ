package interfaz_grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class Punto extends Figura {

    private int x, y;

    @Override
    public void dibujo(Graphics g) {
        //g.setColor(Color.yellow);
        g.fillOval(this.x, this.y, 30, 30);

    }

    public Punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Punto() {
        super();
        String datos = JOptionPane.showInputDialog(null, "Ingrese valores separados por coma");
        StringTokenizer tokkens = new StringTokenizer(datos, ",");
        this.x = Integer.parseInt(tokkens.nextToken());
        this.y = Integer.parseInt(tokkens.nextToken());

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return " Puntos: [x= " + this.x + ", y" + this.y + "]";
    }
}
