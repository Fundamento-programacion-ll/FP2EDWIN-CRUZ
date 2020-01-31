/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author SISTEMAS
 */
public class Circulo extends Dimension{

    public Circulo() {
    }

    public Circulo(double lado, double base, double altura) {
        super(lado, base, altura);
    }
     public double calcularCircunferencia(double diametro){
        
        return diametro*3.1416;
        
    }
}
