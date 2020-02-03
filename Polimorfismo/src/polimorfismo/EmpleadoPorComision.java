package polimorfismo;

/**
 *
 * @author SISTEMAS
 */
public class EmpleadoPorComision extends Empleado {

    Double ventas, TarifaComision;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(Double ventas, Double TarifaComision) {
        this.ventas = ventas;
        this.TarifaComision = TarifaComision;
    }

    public EmpleadoPorComision(Double ventas, Double TarifaComision, String nombre, String apellido, String ci) {
        super(nombre, apellido, ci);
        this.ventas = ventas;
        this.TarifaComision = TarifaComision;
    }

    public Double getVentas() {
        return ventas;
    }

    public void setVentas(Double ventas) {
        this.ventas = ventas < 0 ? 0 : ventas;

    }

    public Double getTarifaComision() {
        return TarifaComision;
    }

    public void setTarifaComision(Double TarifaComision) {
        this.TarifaComision = TarifaComision < 0 ? 0 : TarifaComision;
    }

    public String toString() {
        double total;
        total = ventas * TarifaComision;

        return "EmpleadoPorComision " + "NOMBRE " + getNombre() + " APELLIDO " + getApellido() + " CI " + getCi() + "ventasBrutas " + ventas + " tarifaComision " + TarifaComision + " salario por comision " + calcular_ingresos();

    }

    @Override
    public double calcular_ingresos() {
        return ventas * TarifaComision;
    }
}
