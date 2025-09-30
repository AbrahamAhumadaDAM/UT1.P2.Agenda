/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Pojos;

/**
 *
 * @author abraham
 */
public class Contacto {
    
    public String nombre;
    public String apellido;
    public String numero;
    
    public void Contacto(String nombre, String apellido, String numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumero() {
        return numero;
    }
    
    
    
}
