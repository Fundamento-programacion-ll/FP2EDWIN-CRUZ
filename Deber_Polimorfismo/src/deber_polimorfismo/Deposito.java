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
public class Deposito extends Transaccion {

    Double Saldo;

    Double monto;

    public Deposito(Double Saldo, Double monto) {
        this.Saldo = Saldo;
        this.monto = monto;
    }

    public Deposito(Double Saldo, Double monto, String N_cuenta) {
        super(N_cuenta);
        this.Saldo = Saldo;
        this.monto = monto;
    }

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

    public Deposito() {
    }

    public String toString() {
        if (monto >= 5) {
            this.Saldo += monto ;
            return super.obtenerCuenta() + this.ejecutar();

        } else {
            return "No se puede Depositar menos de $5";
        }

    }

    @Override
    public String ejecutar() {
        return " Saldo Disponible : " + getSaldo();

    }

}
