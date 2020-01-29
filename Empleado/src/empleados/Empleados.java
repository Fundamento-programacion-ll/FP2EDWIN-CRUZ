package empleados;

import java.util.Scanner;

/**
 *
 * @author edwin cruz
 */
public class Empleados {

    public String nombre;
    private String apellido;
    private String fecha_ingreso;
    private String fecha_nacimiento;
    private double salario;

    public Empleados() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
     
        return " Nombre Del Empleado es : " + this.nombre + " Su Salario es : " + this.salario ;
    }
}
