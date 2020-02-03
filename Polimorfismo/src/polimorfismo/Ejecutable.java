package polimorfismo;

/**
 *
 * @author SISTEMAS
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EmpleadoSalariado es = new EmpleadoSalariado(250.50, "Edwin", "Cruz", "1751532985");
        System.out.println(es);

        EmpleadoPorComision epc = new EmpleadoPorComision(5.0, 250.0, "Edwin", "Cruz", "1751532985");
        System.out.println(epc);
        
         EmpleadoSalariado p = new EmpleadoSalariado(32.0, "Edwin", "Cruz", "1751532985");
        System.out.println(p);
        
        EmpleadoPorComision e = new EmpleadoPorComision(320.0, 430.0, "Edwin", "Cruz","1751532985");
        System.out.println(e);
        
        EmpleadoPorHoras h = new EmpleadoPorHoras(210.0, 320.0, "Edwin", "Cruz", "1751532985");
        System.out.println(h);
        
        EmpleadoBaseMasComision b = new EmpleadoBaseMasComision(210.0, 320.0, 2310.0, "Edwin " ," Cruz ", "1751532985");
        System.out.println(b);
    }

}
