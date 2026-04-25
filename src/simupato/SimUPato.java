//BazanEspinoza 
package simupato;

/**
 *
 * @author sistemas
 */
public class SimUPato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pato real = new PatoReal();
        real.mostrar();
        real.realizarCuaqueo();
        real.realizarVuelo();
        real.nadar();
        System.out.println();
        
        Pato goma = new PatoDeGoma();
        goma.mostrar();
        goma.realizarCuaqueo();
        goma.realizarVuelo();
        goma.nadar();
        System.out.println();
        
        Pato senuelo = new PatoSenuelo();
        senuelo.mostrar();
        senuelo.realizarCuaqueo();
        senuelo.realizarVuelo();
        senuelo.nadar();
        System.out.println();
        
        Pato roja = new PatoCabezaRoja();
        roja.mostrar();
        roja.realizarCuaqueo();
        roja.realizarVuelo();
        roja.nadar();
        
    }
    
}
