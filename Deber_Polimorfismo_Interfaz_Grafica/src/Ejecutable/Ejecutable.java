/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import deber_polimorfismo.Consultar;
import deber_polimorfismo.Deposito;
import deber_polimorfismo.Retiros;
import deber_polimorfismo.Transaccion;
import javax.swing.JOptionPane;

/**
 *
 * @author epcqa
 */
public class Ejecutable {

    public static void main(String[] args) {

        int op, i1 = 0;
        Deposito dep[] = null;
        Deposito depo;
        Retiros reti;
        Retiros ret[] = null;
        Consultar con[] = null;
        double saldo1 = 0, monto1 = 0, total = 0;
        String n_cuenta1 = null, nu, usuario = null, contrasenia = null;

        usuario = JOptionPane.showInputDialog(null, "Ingrese Usuario", " Usuario " , JOptionPane.INFORMATION_MESSAGE);
        contrasenia = JOptionPane.showInputDialog(null, "Ingrese Contrasenia", " Contrasenia " ,JOptionPane.INFORMATION_MESSAGE);

        if (usuario.equals("Edwin") && contrasenia.equals("1234")) {
            JOptionPane.showMessageDialog(null, " Bienvenido " + usuario, " Ingreso " ,JOptionPane.INFORMATION_MESSAGE);

            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal \n" + "1.- Depositos\n" + "2.- Retiros\n" + "3.- Consulta Cuenta\n" + " 4.- Salir\n" + "Ingresa Opcion que Deseas "));

                switch (op) {
                    case 1:

                        try {

                            int n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa La Cantidad De Registros Que Deseas Ingresar "));
                            depo = new Deposito();
                            dep = new Deposito[n];
                            for (int i = 0; i < dep.length; i++) {
                                depo.setN_cuenta(JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta", "Depositos", JOptionPane.INFORMATION_MESSAGE));
                                depo.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Saldo que dispone en Su Cuenta", "Depositos", JOptionPane.INFORMATION_MESSAGE)));
                                depo.setMonto(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Monto que desea Realizar", "Depositos", JOptionPane.INFORMATION_MESSAGE)));

                                while (depo.getMonto() <= 5) {
                                    depo.setMonto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto que desea Realizar")));

                                    double total1 = depo.getSaldo() + depo.getMonto();
                                    dep[i] = new Deposito(total1, depo.getMonto(), depo.getN_cuenta());

                                }
                                double total1 = depo.getSaldo() + depo.getMonto();
                                dep[i] = new Deposito(total1, depo.getMonto(), depo.getN_cuenta());
                            }
                        } catch (Exception e) {
                        }
                        for (Deposito de : dep) {

                            //System.out.println("Numero de Cuenta : " + de.getN_cuenta() + " Monto:" + de.getMonto() + " Saldo :" + de.getSaldo());
                            JOptionPane.showMessageDialog(null, "Numero de Cuenta : " + de.getN_cuenta() + " Monto :" + de.getSaldo() + " Saldo:" + de.getMonto());
                        }
                        break;

                    case 2:
                        try {
                            int n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa La Cantidad De Registros Que Deseas Ingresar "));
                            reti = new Retiros();
                            ret = new Retiros[n];
                            for (int i = 0; i < ret.length; i++) {
                                String n_cuenta2 = JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta", "Retiros", JOptionPane.INFORMATION_MESSAGE);
                                reti.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Saldo que dispone en Su Cuenta", "Retiros", JOptionPane.INFORMATION_MESSAGE)));
                                reti.setMonto(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Monto que desea Realizar", "Retiros", JOptionPane.INFORMATION_MESSAGE)));
                                while (reti.getSaldo() <= reti.getMonto() || reti.getMonto() <= 5) {
                                    reti.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Saldo que dispone en Su Cuenta", "Retiros", JOptionPane.INFORMATION_MESSAGE)));

                                    reti.setMonto(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Monto que desea Realizar", "Retiros", JOptionPane.INFORMATION_MESSAGE)));

                                    total = reti.getSaldo() - reti.getMonto();
                                    ret[i] = new Retiros(total, reti.getMonto(), n_cuenta2);

                                }
                                total = reti.getSaldo() - reti.getMonto();
                                ret[i] = new Retiros(total, reti.getMonto(), n_cuenta2);
                            }
                        } catch (Exception e) {
                        }
                        for (Retiros re : ret) {

                            //System.out.println("Numero de Cuenta : " + re.getN_cuenta() + " Monto:" + re.getMonto() + " Saldo :" + re.getSaldo());
                            JOptionPane.showMessageDialog(null, "Numero de Cuenta : " + re.getN_cuenta() + " Monto:" + re.getMonto() + " Saldo :" + re.getSaldo());
                        }
                        break;

                    case 3:
                        try {
                            String nu1 = JOptionPane.showInputDialog(null, "Consulta De Cuentas\n" + "1.-Depositos\n" + "2.-Retiros");
                            if (nu1.equals("2")) {
                                nu = JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta");

                                saldo1 = Double.parseDouble(nu);
                                for (Retiros re : ret) {
                                    if (re.getN_cuenta().equalsIgnoreCase(nu.toString())) {
                                        JOptionPane.showMessageDialog(null, " Nombre " + re.getN_cuenta()
                                                + " Monto " + re.getSaldo()
                                                + " Saldo " + re.getMonto()
                                        );

                                    } else {
                                        System.out.println("Dato No Encontrado");
                                    }
                                }
                            } else if (nu1.equals("1")) {
                                nu = JOptionPane.showInputDialog(null, "Ingrese Numero De Cuenta");

                                saldo1 = Double.parseDouble(nu);
                                for (Deposito de : dep) {
                                    if (de.getN_cuenta().equalsIgnoreCase(nu.toString())) {

                                        JOptionPane.showMessageDialog(null, " Nombre " + de.getN_cuenta()
                                                + " monto " + de.getMonto()
                                                + " Saldo " + de.getSaldo());
                                    } else {
                                        System.out.println("Dato No Encontrado");

                                    }
                                }
                            }

                        } catch (Exception e) {
                        }

                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, " Saliendo....");

                        System.exit(0);

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

                }

            } while (op
                    != 4);
            JOptionPane.showMessageDialog(
                    null, " Saliendo....");
        } else {
            JOptionPane.showMessageDialog(null, " Datos Erroneos ");
            Ejecutable.main(null);

        }

    }
}
