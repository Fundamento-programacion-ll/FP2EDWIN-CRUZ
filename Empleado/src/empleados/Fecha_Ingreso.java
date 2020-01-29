package empleados;

/**
 *
 * @author edwin cruz
 */
public class Fecha_Ingreso {

int dia;
int mes;
int anio;

public Fecha_Ingreso() {
       
    }
    public Fecha_Ingreso(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
     public String toString(){
       return ""+ this.dia + "-" + this.mes + "-" + this.anio;
   }
}
