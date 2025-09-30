/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Pojos.Contacto;
import controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class Vista {
    
    Controlador controlador;
    
    Scanner sc;
    
    public Vista(){
        
        sc = new Scanner(System.in);
    }
    
    public void setControl(Controlador c){
        this.controlador = c;
    }
    
    public Contacto CrearContacto(){
        
        System.out.println("Introduce el nombre");
        
        String nombre = sc.nextLine();
        
        System.out.println("introduce el apellido");
        
        String apellido = sc.nextLine();
        
        System.out.println("introduce el numero");
        
        String numero = sc.nextLine();
        
        Contacto c = new Contacto(nombre, apellido, numero);
        
        return c;
        
    }
    
    
    public String inicio(){
        
        
        System.out.println("Escribe una opcion:");
        
        System.out.println("crear_contacto");
        
        String orden = sc.nextLine();
        
        return orden;
        
    }
}
