/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class Interfaz_Grafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String op;

        op = JOptionPane.showInputDialog(null, "Menu Principal\n" + "1.- Punto\n" + "2.- Circulo");
        do {
            if (op.equalsIgnoreCase("Punto")) {
                Punto punto = new Punto();
                JFrame ventana = new JFrame();
                ventana.add(punto);
                ventana.setSize(700, 600);
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            } else if (op.equalsIgnoreCase("Circulo")) {
                System.out.println("ingresaste circulo");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion No Encontrada");
            }

        } while (op!="Punto" || op!="Circulo");

    }

}
