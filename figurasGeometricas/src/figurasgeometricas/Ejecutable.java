package figurasgeometricas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author SISTEMAS
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tri = new Triangulo();
        Cuadrado cua = new Cuadrado();
        Circulo circ = new Circulo();
        int op = 0, op1 = 0, op2 = 0, op3 = 0;
        try {

            do {
                op = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU PRINCIPAL \n "
                        + "1.- Triangulo \n"
                        + "2.- Cuadrado \n"
                        + "3.- Circulo \n"
                        + "4.- Salir \n"
                        + "INGRESE UNA OPCION [1-4]")));
                switch (op) {
                    case 1:

                        do {
                            op1 = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU TRIANGULO \n "
                                    + "1.- Perimetro Triangulo \n"
                                    + "2.- Area Triangulo \n"
                                    + "3.- Volumen Triangulo \n"
                                    + "4.- Regresar \n"
                                    + "INGRESE UNA OPCION [1-4]")));
                            switch (op1) {
                                case 1:
                                    tri.setLado(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Lado 1")));
                                    double lado2 = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Lado 2")));
                                    double lado3 = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Lado 3")));
                                    JOptionPane.showMessageDialog(null, " Perimetro Triangulo " + +tri.calcularPrimetro(tri.getLado(), lado2, lado3));
                                    break;
                                case 2:
                                    tri.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Base")));
                                    tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Altura")));
                                    JOptionPane.showMessageDialog(null, " Area Triangulo " + tri.calcularArea(tri.getBase(), tri.getAltura()));
                                    break;
                                case 3:
                                    tri.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Base")));
                                    tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Altura")));
                                    JOptionPane.showMessageDialog(null, " Volumen Triangulo " + tri.calcularVolumen(tri.getBase(), tri.getAltura()));
                                    break;
                                case 4:
                                    op = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU PRINCIPAL \n "
                                            + "1.- Triangulo \n"
                                            + "2.- Cuadrado \n"
                                            + "3.- Circulo \n"
                                            + "4.- Salir \n"
                                            + "INGRESE UNA OPCION [1-4]")));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Selecciono Volver Atras.");
                                    break;
                            }

                        } while (op1 != 4);
                        break;
                    case 2:

                        do {
                            op2 = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU CUADRADO\n"
                                    + "1.- Volumen Cuadrado \n"
                                    + "2.- Perimetro Cuadrado \n"
                                    + "3.- Regresar \n"
                                    + "INGRESE UNA OPCION [1-3]")));
                            switch (op2) {
                                case 1:
                                    double arista = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Arista")));
                                    JOptionPane.showMessageDialog(null, " Volumen Cuadrado " + cua.calcularVolumen(arista));
                                    break;
                                case 2:
                                    cua.setLado(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Lado 1")));
                                    double lado4 = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Lado 2")));
                                    JOptionPane.showMessageDialog(null, " Perimetro Cuadrado " + cua.calcularPerimetro(cua.getLado(), lado4));
                                    break;
                                case 3:
                                    op = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU PRINCIPAL \n "
                                            + "1.- Triangulo \n"
                                            + "2.- Cuadrado \n"
                                            + "3.- Circulo \n"
                                            + "4.- Salir \n"
                                            + "INGRESE UNA OPCION [1-4]")));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Saliendo...");
                                    break;
                            }
                        } while (op2 != 3);
                        break;
                    case 3:
                        do {
                            op3 = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU CIRCULO \n"
                                    + "1.- Circunferencia \n"
                                    + "2.- Regresar \n"
                                    + "INGRESE UNA OPCION [1-2]")));
                            switch (op3) {
                                case 1:
                                    double diametro = (Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Diametro")));
                                    JOptionPane.showMessageDialog(null, " Circunferencia " + circ.calcularCircunferencia(diametro));
                                    break;
                                case 2:
                                    op = (Integer.parseInt(JOptionPane.showInputDialog(null, " MENU PRINCIPAL \n "
                                            + "1.- Triangulo \n"
                                            + "2.- Cuadrado \n"
                                            + "3.- Circulo \n"
                                            + "4.- Salir \n"
                                            + "INGRESE UNA OPCION [1-4]")));
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Saliendo...");
                                    break;
                            }
                        } while (op3 != 2);

                }
            } while (op != 4);
            JOptionPane.showMessageDialog(null, "Saliendo...");

        } catch (Exception e) {
        }
    }

}
