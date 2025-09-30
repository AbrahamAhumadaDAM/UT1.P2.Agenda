/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Dao.DaoContacto;
import Vista.Vista;

/**
 *
 * @author abraham
 */
public class Controlador {

  
    private DaoContacto dao;
    private Vista vista;
    String orden = "";

    public Controlador(DaoContacto dao, Vista vista) {
        this.dao = dao;
        this.vista = vista;
    }

   public void actualizarContacto() {
         
        String telefonoBuscado = vista.pedirTelefono();

        String nuevoNombre = vista.pedirNombre();
        String nuevoApellido = vista.pedirApellido();
        String nuevoTelefono = vista.pedirTelefonoNuevo();

        boolean actualizado = dao.actualizarContacto(telefonoBuscado, nuevoNombre, nuevoApellido, nuevoTelefono);

        if (actualizado) {
            vista.mostrarMensaje("Contacto actualizado correctamente.");
        } else {
            vista.mostrarMensaje("No se encontró un contacto con ese teléfono.");
        }
    }

 

    
    public void inicio(){
        
        orden = vista.inicio();
        
        switch (orden){
            case "crear_contacto":
                
                daoContacto.añadirContacto(vista.CrearContacto());
                
                orden = vista.inicio();
                
                break;
                
            case "inicio":
                orden = vista.inicio();
                break;
        }
        
    }
}

