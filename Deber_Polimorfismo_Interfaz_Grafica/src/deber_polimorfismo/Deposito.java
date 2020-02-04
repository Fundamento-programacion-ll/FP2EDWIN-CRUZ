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

    Double monto;
    Double Saldo;

    public Deposito() {
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        
        
        this.monto = monto;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public Deposito(Double monto, Double Saldo) {
        this.monto = monto;
        this.Saldo = Saldo;
    }

    public Deposito(Double monto, Double Saldo, String N_cuenta) {
        super(N_cuenta);
        this.monto = monto;
        this.Saldo = Saldo;
    }

    public String toString() {
        if (this.monto >= 5) {
            this.Saldo = Saldo + monto;
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
