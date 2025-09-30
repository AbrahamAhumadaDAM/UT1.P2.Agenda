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
 
    Vista vista;
    DaoContacto daoContacto;
    String orden = "";
    
    public Controlador(Vista v){
        daoContacto = new DaoContacto();
        this.vista = v;
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
