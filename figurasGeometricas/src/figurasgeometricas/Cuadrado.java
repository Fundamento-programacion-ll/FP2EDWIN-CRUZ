/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

public class Cuadrado extends Dimension {

    public Cuadrado() {
    }

    public Cuadrado(double lado, double base, double altura) {
        super(lado, base, altura);
    }

    public double calcularVolumen(double arista) {

        return Math.pow(arista, 3);

    }

    public double calcularPerimetro(double lado1, double lado2) {

        this.lado=lado1;
        
        return lado * lado2;

    }
}
