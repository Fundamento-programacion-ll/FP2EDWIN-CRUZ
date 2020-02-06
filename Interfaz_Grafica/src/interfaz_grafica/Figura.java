
package interfaz_grafica;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SISTEMAS
 */
public abstract class Figura extends JPanel {
    @Override
    public abstract void paint(Graphics g);
       public abstract double getArea();

   
}
