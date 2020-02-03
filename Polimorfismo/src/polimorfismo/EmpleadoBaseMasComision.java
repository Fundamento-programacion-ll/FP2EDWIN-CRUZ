package polimorfismo;

/**
 *
 * @author SISTEMAS
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    Double salariobase;

    public EmpleadoBaseMasComision() {
    }

    public EmpleadoBaseMasComision(Double salariobase) {
        this.salariobase = salariobase;
    }

    public EmpleadoBaseMasComision(Double salariobase, Double ventas, Double TarifaComision) {
        super(ventas, TarifaComision);
        this.salariobase = salariobase;
    }

    public EmpleadoBaseMasComision(Double salariobase, Double ventas, Double TarifaComision, String nombre, String apellido, String ci) {
        super(ventas, TarifaComision, nombre, apellido, ci);
        this.salariobase = salariobase;
    }

    public Double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(Double salariobase) {
        this.salariobase = salariobase < 0 ? 0 : salariobase;
    }

    public double ingresos() {

        return salariobase * super.calcular_ingresos();
    }

    public String toString() {
        return "Empleado base mas comision " + "NOMBRE " + getNombre() + " APELLIDO " + getApellido() + " CI " + getCi() + " Salario base y comison " + ingresos();
    }

}
