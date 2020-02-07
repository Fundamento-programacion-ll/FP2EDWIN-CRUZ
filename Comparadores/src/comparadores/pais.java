/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class pais {

    private ArrayList<provincias> listaProvincias;

    public pais() {
        this.listaProvincias = new ArrayList<>();
    }

    public pais(ArrayList<provincias> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }

    public ArrayList<provincias> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias() {
        int opcion = 0;
        int x = 0;
        provincias provincia;
        do {
            if (x == JOptionPane.YES_OPTION) {
                provincia = new provincias();
                agregarProvincia(provincia);
                opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
            }

        } while (opcion == JOptionPane.YES_OPTION);
    }

    public void agregarProvincia(provincias provincia) {
        this.listaProvincias.add(provincia);
    }

    @Override
    public String toString() {
        return "Listar provincias \n" + this.listaProvincias;
    }

    public void ordenarPorNombreProvincias() {
        //ordenar lista objetos
        Collections.sort(listaProvincias, new comparador());
    }
    
    public void ordenarPorNumeroHabitantes() {
        //ordenar lista objetos
        Collections.sort(listaProvincias, new comparadorNumeroHabitantes());
    }
}
