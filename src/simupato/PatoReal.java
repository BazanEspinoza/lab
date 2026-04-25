//BazanEspinoza
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoReal extends Pato implements Volable {
    
    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }
    
    public void cuaquear() {
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
    @Override
    public void volar() {
        System.out.println("Puedo volar con mis alas");
    }
    
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }  
}

