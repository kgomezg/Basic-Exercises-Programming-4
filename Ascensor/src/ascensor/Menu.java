/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Camilo Gómez González - kgomezg81832@universidadean.edu.co
 * @date 2020.08.22
 * @desc
 */
public class Menu {

    private final Object[] opciones = {"Seleccione", "Crear Ascensor", "Subir Piso", "Bajar Piso", "Piso Actual", "Pisos Atendidos", "Salir"};
    private Ascensor a = new Ascensor();

    public Menu() {

    }

    public void _start() {
        _seleccion();
    }

    public void _crearAscensor() {
        String pisos, sotanos, piso;

        pisos = (String) JOptionPane.showInputDialog(null, "Digite la cantidad de pisos (solo números).", opciones[1].toString(), JOptionPane.QUESTION_MESSAGE, null, null, "");
        sotanos = (String) JOptionPane.showInputDialog(null, "Digite la cantidad de sotanos (solo números).", opciones[1].toString(), JOptionPane.QUESTION_MESSAGE, null, null, "");
        piso = (String) JOptionPane.showInputDialog(null, "Digite el piso actual (solo números).", opciones[1].toString(), JOptionPane.QUESTION_MESSAGE, null, null, "");

        if (pisos == null || sotanos == null || piso == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "No se pudo realizar el registro del empleado.\nVolvera al inicio.");

        } else {

            a = new Ascensor(Integer.parseInt(pisos), Integer.parseInt(sotanos), Integer.parseInt(piso));

            JOptionPane.showMessageDialog(
                    null,
                    "El ascensor ha sido registrado con exito.\nVolvera al inicio.");

        }

        _start();
    }

    private void _subirPiso() {
        if (a.getCantPisos() > 0 && a.getCantSotanos() > 0) {
            a._subirPiso();

            JOptionPane.showMessageDialog(
                    null,
                    "Operación realizada con exito.\nVolvera al inicio.");

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Registre primero un ascensor.\nVolvera al inicio.");
        }

        _start();
    }

    private void _bajarPiso() {
        if (a.getCantPisos() > 0 && a.getCantSotanos() > 0) {
            a._bajarPiso();

            JOptionPane.showMessageDialog(
                    null,
                    "Operación realizada con exito.\nVolvera al inicio.");

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Registre primero un ascensor.\nVolvera al inicio.");
        }

        _start();

    }

    private void _pisoActual() {
        if (a.getCantPisos() > 0 && a.getCantSotanos() > 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Administrador de Ascensores\nPiso Actual: " + a.getPisoActual() + "\nVolvera al inicio.");

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Registre primero un ascensor.\nVolvera al inicio.");
        }

        _start();
    }

    private void _pisosAtendidos() {
        if (a.getCantPisos() > 0 && a.getCantSotanos() > 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Administrador de Ascensores\nPisos Atendidos:\n" + a._pisosAtendidos() + "\nVolvera al inicio.");

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Registre primero un ascensor.\nVolvera al inicio.");
        }

        _start();
    }

    private void _exit() {
        switch (JOptionPane.showConfirmDialog(null, "¿Señor(a) Usuario(a), ¿Desea salir del administrador?", "Administrador de Ascensores",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            case 0 -> {
                JOptionPane.showMessageDialog(null, "Gracias por usar el administrador de Ascensores.", "Administrador de Ascensores", JOptionPane.INFORMATION_MESSAGE, null);
            }
            case 1 -> {
                JOptionPane.showMessageDialog(null, "Volvera al inicio.", "Administrador de Ascensores", JOptionPane.INFORMATION_MESSAGE, null);

                _start();
            }
        }
    }

    public void _seleccion() {
        JOptionPane.showMessageDialog(
                null,
                "Administrador de Ascensores\nSeleccione una opción correcta, por favor.");

        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Menú de Opciones",
                "Ascensores",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                opciones,
                opciones[0]);

        if (seleccion == null) {
            _start();
        } else if (seleccion.toString().length() > 0) {

            if (seleccion.equals(opciones[0])) {
                JOptionPane.showMessageDialog(
                        null,
                        "Seleccione una opción correcta, por favor.");

            } else if (seleccion.equals(opciones[1])) {
                _crearAscensor();
            } else if (seleccion.equals(opciones[2])) {
                _subirPiso();
            } else if (seleccion.equals(opciones[3])) {
                _bajarPiso();
            } else if (seleccion.equals(opciones[4])) {
                _pisoActual();
            } else if (seleccion.equals(opciones[5])) {
                _pisosAtendidos();
            } else if (seleccion.equals(opciones[6])) {
                _exit();
            }
        }
    }

}
