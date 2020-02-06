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
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();

    }

    public static void Menu() {

        Punto punto = new Punto(25, 20);
        Circulo circulo = new Circulo(25, 20);
        Cuadrado cuadrado = new Cuadrado(0);
        Rectangulo rectangulo = new Rectangulo(0, 0);
        Cilindro cilindro = new Cilindro(0, 0, 0, 0);

        String opcion = JOptionPane.showInputDialog(null, "Menu Principal :\n- PUNTO\n- CIRCULO\n- CUADRADO\n- RECTANGULO\n- CILINDRO", "MENU", 1);

        if (opcion.equalsIgnoreCase("Punto")) {
            punto.Punto();

            JFrame ventana = new JFrame();

            ventana.add(punto);

            ventana.setSize(700, 400);

            ventana.setVisible(true);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (opcion.equalsIgnoreCase("Circulo")) {
            circulo.Circulo();

            JFrame ventana = new JFrame();

            ventana.add(circulo);

            ventana.setSize(700, 400);

            ventana.setVisible(true);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (opcion.equalsIgnoreCase("Cuadrado")) {

            cuadrado.Cuadrado();

            JFrame ventana = new JFrame();

            ventana.add(cuadrado);

            ventana.setSize(700, 400);

            ventana.setVisible(true);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (opcion.equalsIgnoreCase("Rectangulo")) {

            rectangulo.Rectangulo();

            JFrame ventana = new JFrame();

            ventana.add(rectangulo);

            ventana.setSize(700, 400);

            ventana.setVisible(true);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (opcion.equalsIgnoreCase("Cilindro")) {

            cilindro.Cilindro();

            JFrame ventana = new JFrame();

            ventana.add(cilindro);

            ventana.setSize(700, 400);

            ventana.setVisible(true);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            JOptionPane.showMessageDialog(null, "Opcion Ingresada Incorrecta", "ERROR", 0);
            Ejecutable.main(null);
        }

    }

}
