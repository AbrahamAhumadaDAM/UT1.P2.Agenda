package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;

public class DaoContacto {
    
    private final ArrayList<Contacto> contactos;
    
    public DaoContacto() {
        contactos = new ArrayList<>();
    }
    
    public void añadirContacto(Contacto c){
        contactos.add(c);
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

    public Contacto buscarPorTelefono(String patron) {
        String p = patron.trim();
        for (Contacto c : contactos) {
            if (c.getNumero() != null && c.getNumero().contains(p)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarContactos(ArrayList<Contacto> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay resultados.");
            return;
        }
        int i = 1;
        for (Contacto c : lista) {
            System.out.println(i++ + ") " + c.getNombre() + " | " + c.getNumero());

        }
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
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
}