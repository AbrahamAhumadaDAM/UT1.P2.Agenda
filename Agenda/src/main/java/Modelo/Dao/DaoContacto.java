/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;

public class DaoContacto {
    private ArrayList<Contacto> contactos;

    public DaoContacto() {
        contactos = new ArrayList<>();
    }

    public boolean borrarContactoDadaPosicion(int posicion) {
        if (posicion >= 0 && posicion < contactos.size()) {
            contactos.remove(posicion);
            return true;
        }
        return false;
    }

    public boolean borrarContactoDadoNombre(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                contactos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean borrarAgendaCompleta() {
        if (!contactos.isEmpty()) {
            contactos.clear();
            return true;
        }
        return false;
    }

    public boolean hayContactos() {
        return !contactos.isEmpty();
    }
}
