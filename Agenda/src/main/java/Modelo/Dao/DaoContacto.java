/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class DaoContacto {

    private ArrayList<Contacto> contactos;

    public DaoContacto() {
        contactos = new ArrayList<Contacto>();
    }


    public boolean actualizarContacto(String telefonoBuscado, String nuevoNombre, String nuevoApellido, String nuevoTelefono) {
        for (Contacto c : contactos) {
            if (c.getNumero().equals(telefonoBuscado)) {
                c.setNombre(nuevoNombre);
                c.setApellido(nuevoApellido);
                c.setNumero(nuevoTelefono);
                return true; 
            }
        }
        return false; 
    }
}