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

    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto: [x = " + this.x + " y = " + this.y + "]";
    }

    public void Punto() {

        String datos = JOptionPane.showInputDialog(null, "Ingrese los elementos separados por (,)");
        StringTokenizer tokkens = new StringTokenizer(datos, ",");

        this.x = Integer.parseInt(tokkens.nextToken());
        this.y = Integer.parseInt(tokkens.nextToken());

    }

    @Override
    public void paint(Graphics g) {
       g.setColor(Color.RED);
        g.fillOval(this.x, this.y, 30, 30);
    }

    @Override
    public double getArea() {
        return 0;
    }

}
