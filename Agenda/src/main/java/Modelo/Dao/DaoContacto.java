package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;

/**
 *
 * @author abraham
 */
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

}
