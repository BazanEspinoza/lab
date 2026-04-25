//BazanEspinoza
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato implements Cuaqueable, Volable {

    public PatoDeGoma() {
        volable = new NoVuela();
        cuaqueable = new Chirreo();
    }
    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma");
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
