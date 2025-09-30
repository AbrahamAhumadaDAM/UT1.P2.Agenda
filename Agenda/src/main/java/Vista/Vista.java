
package Vista;


import Modelo.Dao.DaoContacto;
import Modelo.Pojos.Contacto;
import controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class Vista {

   private DaoContacto dao;
   private Scanner sc;

   public Vista() {
       dao = new DaoContacto();
       sc = new Scanner(System.in);
   }
   
   public void PreguntarContactos(){
       System.out.println("Esta es la lista de contactos: ");
   }
   
   public void PreguntarPorNombre(){
       System.out.println("¿Qué nombre estás buscando? ");
   }
   
    public void PreguntarPorTelefono(){
       System.out.println("¿Qué teléfono estás buscando? ");
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


   

    public void mostrarMenu() {
        System.out.println("1. Borrar contacto por posición");
        System.out.println("2. Borrar contacto por nombre");
        System.out.println("3. Borrar agenda completa");
        System.out.println("4. Salir");
    }

    public void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la posición del contacto a borrar: ");
                    int pos = Integer.parseInt(sc.nextLine());
                    if (dao.borrarContactoDadaPosicion(pos)) {
                        System.out.println("Se ha borrado el contacto.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Introduce el nombre del contacto a borrar: ");
                    String nombre = sc.nextLine();
                    if (dao.borrarContactoDadoNombre(nombre)) {
                        System.out.println("Se ha borrado el contacto.");
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;

                case 3:
                    if (dao.hayContactos()) {
                        System.out.print("¿Está seguro que desea borrar todos los contactos? (si/no): ");
                        String confirmacion = sc.nextLine();
                        if (confirmacion.equalsIgnoreCase("si")) {
                            dao.borrarAgendaCompleta();
                            System.out.println("Se han borrado todos los contactos.");
                        } else {
                            System.out.println("Operación cancelada.");
                        }
                    } else {
                        System.out.println("No hay contactos en la agenda.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    
    Controlador controlador;
   
    
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


