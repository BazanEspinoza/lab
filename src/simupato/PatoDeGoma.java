//BazanEspinoza
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato implements Cuaqueable, Volable {

    @Override
    public void mostrar() {
        
    }

    @Override
    public void cuaquear() {
         System.out.println("Chirr Chirr");
    }

    @Override
    public void volar() {        
        System.out.println("INCAPAZ DE VOLAR");
    }
    
}
