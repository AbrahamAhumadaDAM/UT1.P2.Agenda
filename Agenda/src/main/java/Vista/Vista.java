/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class Vista {
    private Scanner sc;

    public Vista() {
        sc = new Scanner(System.in);
    }

    public String pedirTelefono() {
        System.out.print("Introduce el teléfono del contacto a actualizar: ");
        return sc.nextLine();
    }

    public String pedirNombre() {
        System.out.print("Introduce el nuevo nombre: ");
        return sc.nextLine();
    }

    public String pedirApellido() {
        System.out.print("Introduce el nuevo apellido: ");
        return sc.nextLine();
    }

    public String pedirTelefonoNuevo() {
        System.out.print("Introduce el nuevo teléfono: ");
        return sc.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}