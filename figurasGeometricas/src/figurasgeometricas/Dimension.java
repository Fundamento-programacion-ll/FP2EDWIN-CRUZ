package figurasgeometricas;

/**
 *
 * @author SISTEMAS
 */
public class Dimension {

    double lado, base, altura;

    public Dimension() {
    }

    public Dimension(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
