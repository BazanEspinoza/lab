//BazanEspinoza
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoCabezaRoja extends Pato implements Volable, Cuaqueable {

    public PatoCabezaRoja() {
        volable = new Vuelaconalas();
        cuaqueable = new Cuaqueo();
    }
    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATO CABEZA ROJA");
    }

    @Override
    public void volar() {
        System.out.println("Puedo volar con mis alas");
    }

    @Override
    public void cuaquear() {
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");

    }
}
