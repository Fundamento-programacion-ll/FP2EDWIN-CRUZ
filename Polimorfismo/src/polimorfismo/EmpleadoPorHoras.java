package polimorfismo;

/**
 *
 * @author SISTEMAS
 */
public class EmpleadoPorHoras extends Empleado {

    Double sueldo, horas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(Double sueldo, Double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public EmpleadoPorHoras(Double sueldo, Double horas, String nombre, String apellido, String ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

   

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = ((horas > 0 && horas <= 168) ? horas : 0);
    }

    @Override
    public double calcular_ingresos() {
        return 0.0;
    }

    public String toString() {
        return "Empleado Asalariado: \n Nombre: " + getNombre() + " Apellido: " + getApellido() + " Por horas: " + getHoras();
    }
}
