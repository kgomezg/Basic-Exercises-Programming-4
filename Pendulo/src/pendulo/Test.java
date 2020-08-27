/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pendulo;

/**
 *
 * @author Kevin Camilo Gómez González - kgomezg81832@universidadean.edu.co
 * @date 2020.08.22
 * @desc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pendulo a = new Pendulo(50, 5);
        a.oscilacion();
        a.getPendulo();

        System.out.println("");

        Pendulo b = new Pendulo();
        b.setL(69);
        b.setA(2);
        b.oscilacion();
        System.out.println(b.getL());
        System.out.println(b.getA());

    }

}
