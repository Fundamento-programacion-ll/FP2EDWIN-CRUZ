package polimorfismo;

/**
 *
 * @author SISTEMAS
 */
public class EmpleadoSalariado extends Empleado {

    Double salariosemanal;

    public EmpleadoSalariado() {
    }

    public EmpleadoSalariado(Double salariosemanal) {
        this.salariosemanal = salariosemanal;
    }

    public EmpleadoSalariado(Double salariosemanal, String nombre, String apellido, String ci) {
        super(nombre, apellido, ci);
        this.salariosemanal = salariosemanal;
    }

    public Double getSalariosemanal() {
        return salariosemanal;
    }

    public void setSalariosemanal(Double salariosemanal) {
        this.salariosemanal = salariosemanal;
    }

    @Override
    public  String toString() {
        return " Salario : " + salariosemanal + " Nombre : " + getNombre() + " Apellido : " + getApellido() + " C.I : " + getCi();
    }

    @Override
    public double calcular_ingresos() {
        return this.salariosemanal;

    }

}
