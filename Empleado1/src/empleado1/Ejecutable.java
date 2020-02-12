/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado1;

import empleado1.Administrativo;
import empleado1.Docente;
import empleado1.Limpieza;
import empleado1.Persona;
import empleado1.Sueldos;
import empleado1.menorAmayor;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Cruz
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int op;
            String nom, apell, gen, area, cargo, turno;
            int edad, ci;
            double sueldo;

            Sueldos su1 = new Sueldos("Administrador", 1000);
            Sueldos su2 = new Sueldos("Docentes", 500);
            Sueldos su3 = new Sueldos("Limpieza", 100);

            Persona p = new Persona();
            Administrativo ad = new Administrativo();
            Docente doc = new Docente();
            Limpieza lim = new Limpieza();

            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n" + "1.- Administrativo\n" + "2.- Docente\n" + "3.- Limpieza\n" + "4.- Visualizar Sueldos\n"
                        + "5.- Salir\n" + "Ingresa Una Opcion"));
                switch (op) {

                    case 1:
                        ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese CI.: "));
                        nom = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        apell = JOptionPane.showInputDialog("Ingrese Apellido: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad: "));
                        gen = JOptionPane.showInputDialog("Ingrese el Genero: ");
                        area = JOptionPane.showInputDialog("Ingrese Area: ");

                        ad.setNombre(nom);
                        ad.setApellido(apell);
                        ad.setGenero(gen);
                        ad.setEdad(edad);
                        ad.setCi(ci);
                        ad.setArea(area);
                        break;
                    case 2:
                        ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese CI.: "));
                        nom = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        apell = JOptionPane.showInputDialog("Ingrese Apellido: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad: "));
                        gen = JOptionPane.showInputDialog("Ingrese Genero: ");
                        area = JOptionPane.showInputDialog("Ingrese Area: ");
                        cargo = JOptionPane.showInputDialog("Ingrese Cargo: ");

                        doc.setNombre(nom);
                        doc.setApellido(apell);
                        doc.setGenero(gen);
                        doc.setEdad(edad);
                        doc.setCi(ci);
                        doc.setArea2(area);
                        doc.setCargo(cargo);
                        break;

                    case 3:
                        ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese CI.: "));

                        nom = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        apell = JOptionPane.showInputDialog("Ingrese Apellido: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad: "));

                        gen = JOptionPane.showInputDialog("Ingrese Genero: ");
                        turno = JOptionPane.showInputDialog("Ingrese Turno: ");

                        lim.setNombre(nom);
                        lim.setApellido(apell);
                        lim.setGenero(gen);
                        lim.setEdad(edad);
                        lim.setCi(ci);
                        lim.setTurno(turno);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Administrativo \n" + ad.toString());
                        JOptionPane.showMessageDialog(null, "Docente \n" + doc.toString());
                        JOptionPane.showMessageDialog(null, "Limpieza \n" + lim.toString());

                        JOptionPane.showMessageDialog(null, su1.toString());
                        JOptionPane.showMessageDialog(null, su2.toString());
                        JOptionPane.showMessageDialog(null, su3.toString());

                        ArrayList<Sueldos> lista = new ArrayList();
                        lista.add(su1);
                        lista.add(su2);
                        lista.add(su3);

                        Collections.sort(lista, new menorAmayor());
                        JOptionPane.showMessageDialog(null, " Sueldo de menor a mayor: " + lista);
                }

            } while (op != 5);
            JOptionPane.showMessageDialog(null, " Saliendo....");

        } catch (Exception e) {
        }

    }
}
