/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class provincias {
    private String nombreProvincia;
    private int numeroHabitantes;

    public provincias() {
        String datos;
        
        datos = JOptionPane.showInputDialog(null, "Ingrese los datos separados por punto y coma");
        StringTokenizer  tokens = new StringTokenizer(datos,";");
        this.nombreProvincia = tokens.nextToken();
        this.numeroHabitantes = Integer.parseInt(tokens.nextToken());        
    }
        
    public provincias(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
        

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
    
}
