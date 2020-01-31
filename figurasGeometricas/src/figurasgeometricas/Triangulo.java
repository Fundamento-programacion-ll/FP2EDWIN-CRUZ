package figurasgeometricas;

/**
 *
 * @author SISTEMAS
 */
public class Triangulo extends Dimension {

    public Triangulo() {
    }

    public Triangulo(double lado, double base, double altura) {
        super(lado, base, altura);
    }

    public double calcularPrimetro(double lado1, double lado2, double lado3) {
        this.lado = lado1;

        return lado * lado2 * lado3;

    }

    public double calcularArea(double b, double h) {
        this.base = b;
        this.altura = h;

        return (base * altura) / 2;

    }

    public double calcularVolumen(double ba, double alt) {
        this.base = ba;
        this.altura = alt;

        return (base * altura) * 1 / 3;

    }
}
