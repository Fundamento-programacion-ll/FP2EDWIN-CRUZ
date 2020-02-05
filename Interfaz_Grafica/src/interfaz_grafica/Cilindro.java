/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;

/**
 *
 * @author SISTEMAS
 */
public class Cilindro extends Circulo{
    int h;

    public Cilindro() {
    }

    public Cilindro(int h, int radio, int x, int y) {
        super(radio, x, y);
        this.h = h;
    }

    public Cilindro(int h, int radio) {
        super(radio);
        this.h = h;
    }

    public Cilindro(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    
}
