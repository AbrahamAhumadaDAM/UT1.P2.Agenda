package com.mycompany.agenda;

import Modelo.Modelo;
import Vista.Vista;
import controlador.Controlador;


/**
 *
 * @author abraham
 */
public class Main {

    public static void main(String[] args) {
        Modelo m = new Modelo();
        Vista v = new Vista();
        Controlador c = new Controlador(v);
        c.Iniciar();
    }
}
