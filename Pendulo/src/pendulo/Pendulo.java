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
public class Pendulo {

    private double l, a;

    public Pendulo() {

    }

    public Pendulo(double _l, double _a) {
        this.l = _l;
        this.a = _a;
    }

    public void oscilacion() {
        System.out.println(2 * Math.PI * (Math.sqrt(a / l)));
    }

    public void getPendulo() {
        System.out.println("Longitud: " + this.l + ", Aceleración: " + this.a);
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
