//BazanEspinoza
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
    volable = new NoVuela();
    cuaqueable = new Cuaqueomudo();
}
    @Override
    public void mostrar() {
        System.out.println("Yo soy pato senuelo");

    }
    public void cuaquear() {
        System.out.println("<<Silencio>>");
    }
    
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }
    
    @Override
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }
}
