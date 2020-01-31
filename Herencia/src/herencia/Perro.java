package herencia;

/**
 *
 * @author SISTEMAS
 */
public class Perro extends Animal {
private float estatura;

   

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public Perro() {
    }

    public Perro(float estatura) {
        this.estatura = estatura;
    }

    public Perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }
    public void  datosPerro(){
        System.out.println(" Nombre : " + getNombre() + " Edad : " +getEdad());
    }
}
