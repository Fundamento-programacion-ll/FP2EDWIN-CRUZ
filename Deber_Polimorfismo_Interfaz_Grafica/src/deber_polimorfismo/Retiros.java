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
public class Retiros extends Transaccion {

    Double monto;
    Double Saldo;

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getN_cuenta() {
        return N_cuenta;
    }

    public void setN_cuenta(String N_cuenta) {
        this.N_cuenta = N_cuenta;
    }

    public Retiros() {
    }

    public Retiros(Double monto, Double Saldo) {
        this.monto = monto;
        this.Saldo = Saldo;
    }

    public Retiros(Double Saldo, Double monto, String N_cuenta) {
        super(N_cuenta);
        this.Saldo = Saldo;

        this.monto = monto;
    }

    public String toString() {
        if (monto >= 5 && monto  <= Saldo  ) {
            this.Saldo = Saldo - monto;
            return super.obtenerCuenta() + this.ejecutar();

        } else {
            return "No se puede Realizar la Transaccion";
        }

    }

    @Override
    public String ejecutar() {
        return " Saldo Disponible : " + this.Saldo;

    }

}
