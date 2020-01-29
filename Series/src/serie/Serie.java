package serie;

import java.util.Scanner;

/**
 *
 * @author SISTEMAS
 */
public class Serie {

    
public void Calcular(){
    metodos me = new metodos();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Base");
        me.setNumero(leer.nextInt());
        System.out.println("Ingrese Exponente");
        me.setNumero1(leer.nextInt());

        for (me.j = 1; me.j <= me.numero1; me.j++) {
            System.out.println(me.numero + "X" + me.j + "=" + me.numero * me.j);

        }
        System.out.println();

}
}
