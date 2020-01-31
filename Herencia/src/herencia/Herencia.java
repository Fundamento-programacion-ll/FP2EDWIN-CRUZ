package herencia;

/**
 *
 * @author SISTEMAS
 */
public class Herencia {

    public static void main(String[] args) {

        Perro perro = new Perro(85, "Frenchppodle", "M", "Yogui", 5);
        perro.datosPerro();
        System.out.println("Suma : " + perro.suma(10, 15));

        Gato gato = new Gato("Marron", (float) 0.80, "Frenchppodle", "M", "Chispa", 3);
        gato.datosGato();
    }
// clase dimension 
    /*lados 
            base
            altura
                    triangulo area,volumen,perimetro
                            cuadrado area volumen
                            circulo valor circunferncia
     */
}
