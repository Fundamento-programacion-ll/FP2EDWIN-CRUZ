/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_polimorfismo;

/**
 *
 * @author epcqa
 */
public class Consultar extends Transaccion {

    String nombres, apellidos, ci;

    public Consultar(String nombres, String apellidos, String ci) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Consultar(String nombres, String apellidos, String ci, String N_cuenta) {
        super(N_cuenta);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
    }

    @Override
    public String ejecutar() {
        return " Nombre : " + this.nombres + " Apellidos : " + this.apellidos + " Cedula : " + this.ci;
    }

    public String toString() {
        return this.ejecutar() + super.obtenerCuenta();

    }
}
