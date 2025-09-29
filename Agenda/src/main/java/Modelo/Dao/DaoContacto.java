/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.Pojos.Contacto;
import java.util.ArrayList;

/**
 *
 * @author abraham
 */
public class DaoContacto {
    
    private ArrayList<Contacto> contactos;
    
    public DaoContacto(){
        contactos = new ArrayList<Contacto>();
    }
    
    public void añadirContacto(Contacto c){
        contactos.add(c);
    }
    
    
}
