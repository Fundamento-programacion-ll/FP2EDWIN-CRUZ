package Ejecutable;

import empleados.Empleados;
import empleados.Fecha_Ingreso;
import empleados.Fecha_Nacimiento;
import javax.swing.JOptionPane;

/**
 *
 * @author edwin cruz
 */
public class Main {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa La Cantidad De Registros Que Deseas Ingresar ")
            );
            Empleados em[] = new Empleados[n];
            Fecha_Ingreso fech[] = new Fecha_Ingreso[n];

            double d = 0, in = 0, d1 = 0, in1 = 0;

            for (int i = 0; i < em.length; i++) {
                Empleados emp = new Empleados();
                Fecha_Ingreso fe = new Fecha_Ingreso();
                Fecha_Nacimiento fecha_nacimiento = new Fecha_Nacimiento();

                emp.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre Empleado" + " " + (i + 1)));
                //System.out.println("Ingresa Apellido Empleado" + (i + 1) + " ; ");
                emp.setApellido(JOptionPane.showInputDialog(null, "Ingresa Apellido Empleado"));
                fecha_nacimiento.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Dia De Nacimiento del Empleado")));
                fecha_nacimiento.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Mes De Nacimiento del Empleado")));
                fecha_nacimiento.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Anio De Nacimiento del Empleado")));
                fe.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, " Dia De Ingreso Del Empleado")));

                fe.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, " Mes De Ingreso Del Empleado ")));;
                fe.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, " Anio De Ingreso Del Empleado ")));

                emp.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa Salario Del Empleado " + emp.getNombre())));

                if (emp.getSalario() > d) {
                    d = emp.getSalario();
                    in = i;
                }
                em[i] = emp;
                if (fe.getAnio() < d1) {
                    d1 = fe.getAnio();
                    in1 = i;
                }
                fech[i] = fe;
            }
            JOptionPane.showMessageDialog(null, "El Empleado Con Mayor Sueldo es : " + em[(int) in]);
            JOptionPane.showMessageDialog(null, "El Empleado Mas Antiguo De La Empresa es : " + em[(int) in1] + " Fecha De Ingreso Del Empleado es : " + fech[(int) in1]);

        } catch (Exception e) {
        }

    }
}
