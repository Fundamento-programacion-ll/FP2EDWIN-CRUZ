package herencia;

/**
 *
 * @author SISTEMAS
 */
public class Gato extends Animal {

    private String color_ojos;
    private float estatura;

    public Gato() {
    }

    public Gato(String color_ojos, float estatura) {
        this.color_ojos = color_ojos;
        this.estatura = estatura;
    }

    public Gato(String color_ojos, float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.color_ojos = color_ojos;
        this.estatura = estatura;
    }
public void  datosGato(){
        System.out.println(" Nombre : " + getNombre() + " Especie : " +getEspecie()+ " Edad : " +getEdad());
    }
}
