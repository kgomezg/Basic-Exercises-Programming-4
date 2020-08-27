/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kevin Camilo Gómez González - kgomezg81832@universidadean.edu.co
 * @date 2020.08.22
 * @desc
 */
public class Ascensor {

    private int cantPisos, cantSotanos, pisoActual;
    private final List<Integer> pisos = new ArrayList<Integer>();

    public Ascensor() {

    }

    public Ascensor(int _canPis, int _canSot, int _pisAct) {
        this.cantPisos = _canPis;
        this.cantSotanos = _canSot;
        this.pisoActual = _pisAct;

        for (int i = 1; i <= cantSotanos; i++) {
            pisos.add(i * -1);
        }

        for (int i = 1; i <= cantPisos; i++) {
            pisos.add(i);
        }

        Collections.sort(pisos);

    }

    public void _subirPiso() {
        int pisActual = getPisoActual(), posNuevaPisos, pisNueva;

        if ((pisActual + 1) >= 1 && (pisActual + 1) <= getCantPisos()) {
            posNuevaPisos = pisos.indexOf(pisActual) + 1;
            if (pisos.get(posNuevaPisos) != null) {
                pisNueva = pisos.get(posNuevaPisos);
                setPisoActual(pisNueva);
            }

        } else if ((pisActual + 1) <= 1 && (pisActual + 1) >= (getCantSotanos())) {
            posNuevaPisos = pisos.indexOf(pisActual) + 1;
            if (pisos.get(posNuevaPisos) != null) {
                pisNueva = pisos.get(posNuevaPisos);
                setPisoActual(pisNueva);
            }
        }
    }

    public void _bajarPiso() {
        int pisActual = getPisoActual(), posNuevaPisos, pisNueva;

        if ((pisActual - 1) >= 1 && (pisActual - 1) <= getCantPisos()) {
            posNuevaPisos = pisos.indexOf(pisActual) - 1;
            if (pisos.get(posNuevaPisos) != null) {
                pisNueva = pisos.get(posNuevaPisos);
                setPisoActual(pisNueva);
            }

        } else if ((pisActual - 1) <= 1 && (pisActual - 1) >= (getCantSotanos() * -1)) {
            posNuevaPisos = pisos.indexOf(pisActual) - 1;
            if (pisos.get(posNuevaPisos) != null) {
                pisNueva = pisos.get(posNuevaPisos);
                setPisoActual(pisNueva);
            }
        }
    }

    public String _pisosAtendidos() {
        String msj = "";
        for (int i = 0; i < pisos.size(); i++) {
            msj += (i == 0 ? "" : "\n") + "Piso: " + pisos.get(i);
        }

        return msj;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getCantSotanos() {
        return cantSotanos;
    }

    public void setCantSotanos(int cantSotanos) {
        this.cantSotanos = cantSotanos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public static final void imprimir(String msj) {
        System.out.println(msj);
    }

}
