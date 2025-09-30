/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenda;


import Vista.Vista;
import controlador.Controlador;


/**
 *
 * @author abraham
 */
public class Main {

    public static void main(String[] args) {
        
        
        Vista v = new Vista();
        Controlador controlador = new Controlador(v);
        
        controlador.inicio();
        
        
    }
}
