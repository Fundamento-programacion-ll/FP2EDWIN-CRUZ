
package deber_polimorfismo;

/**
 *
 * @author epcqa
 */
public abstract class Transaccion {

    String N_cuenta;

    public String getN_cuenta() {
        return N_cuenta;
    }

    public void setN_cuenta(String N_cuenta) {
        this.N_cuenta = N_cuenta;
    }

    public Transaccion() {
    }

    public Transaccion(String N_cuenta) {
        this.N_cuenta = N_cuenta;
    }

    public String obtenerCuenta() {
    return " Numero de Cuenta : " + this.N_cuenta;

    }

    public abstract String ejecutar();

}
