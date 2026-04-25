/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupato;

/**
 *
 * @author sistemas
 */
public class PatoSenuelo extends Pato {

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
