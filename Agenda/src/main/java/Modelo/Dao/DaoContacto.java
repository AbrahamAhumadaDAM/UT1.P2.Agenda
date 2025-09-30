package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;
import java.util.Scanner;

public class DaoContacto {


    private ArrayList<Contacto> contactos;

    public DaoContacto() {
        contactos = new ArrayList<Contacto>();
    }

    public ArrayList<Contacto> listarContactos() {
        return new ArrayList<>(contactos);
    }

    public ArrayList<Contacto> buscarPorNombre(String patron) {
        String p = patron.toLowerCase().trim();
        ArrayList<Contacto> resultado = new ArrayList<>();
        for (Contacto c : contactos) {
            if (c.getNombre() != null && c.getNombre().toLowerCase().contains(p)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public ArrayList<Contacto> buscarPorTelefono(String patron) {
        String p = patron.trim();
        ArrayList<Contacto> resultado = new ArrayList<>();
        for (Contacto c : contactos) {
            if (c.getNumero() != null && c.getNumero().contains(p)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    private static void mostrarContactos(ArrayList<Contacto> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay resultados.");
            return;
        }
        int i = 1;
        for (Contacto c : lista) {
            System.out.println(i++ + ") " + c.getNombre() + " | " + c.getNumero());

        }
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
    
    public void añadirContacto(Contacto c){
        contactos.add(c);
    }
    

}

