/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import deber_polimorfismo.Consultar;
import deber_polimorfismo.Deposito;
import deber_polimorfismo.Retiros;
import javax.swing.JOptionPane;

/**
 *
 * @author epcqa
 */
public class Ejecutable {

    Deposito de;

    public static void main(String[] args) {
        // Datos Quemados
        Deposito de = new Deposito(300.0, 10.0, "N-001");
        System.out.println(de);

        Retiros re = new Retiros(1400.0, 990.0, "N-004");
        System.out.println(re);

        Consultar co = new Consultar("Edwin", "Cruz", "175153298-5", "N-004");
        System.out.println(co);

        // Datos Ingresados Por teclado
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal \n" + "1.- Depositos\n" + "2.- Retiros\n" + "3.- Consulta Cuenta\n" + " 4.- Salir\n" + "Ingresa Opcion que Deseas "));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "----Depositos----");

                    String n_cuenta1 = JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta");
                    Double saldo1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Saldo que dispone en Su Cuenta"));
                    Double monto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto que desea Realizar"));
                    Deposito de2 = new Deposito(saldo1, monto1, n_cuenta1);
                    JOptionPane.showMessageDialog(null, de2);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "----Retiros----");
                    String n_cuenta2 = JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta");
                    Double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Saldo que dispone en Su Cuenta"));
                    Double monto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto que desea Realizar"));
                    Retiros re2 = new Retiros(saldo2, monto2, n_cuenta2);
                    JOptionPane.showMessageDialog(null, re2);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "----Consultas De Cuentas ----");
                    String ncuenta = JOptionPane.showInputDialog(null, " Ingrese N-Cuenta ");
                    String nombre = JOptionPane.showInputDialog(null, " Ingrese Nombre ");
                    String apellido = JOptionPane.showInputDialog(null, " Ingrese Apellido ");
                    String cedula = JOptionPane.showInputDialog(null, " Ingrese N-Cedula ");
                    Consultar con = new Consultar(nombre, apellido, cedula, ncuenta);
                    JOptionPane.showMessageDialog(null, con);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, " Saliendo....");

                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

            }

        } while (op != 4);
        JOptionPane.showMessageDialog(null, " Saliendo....");

    }

}
