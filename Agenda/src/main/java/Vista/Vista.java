package Vista;


import Modelo.Dao.DaoContacto;
import Modelo.Pojos.Contacto;
import java.util.Scanner;

/**
 *
 * @author abraham
 */
public class Vista {

    private final DaoContacto dao;
    private final Scanner sc;

    public Vista() {
       dao = new DaoContacto();
       sc = new Scanner(System.in);
    }
   
    public void PreguntarContactos(){
       System.out.println("Esta es la lista de contactos: ");
    }
   
    public String PreguntarPorNombre(){
       System.out.println("¿Qué nombre estás buscando? ");
       String nombre = sc.nextLine();
       return nombre;
    }
   
    public void ContactoEncontrado(){
       System.out.println("Este es el contacto que estás buscando");
       System.out.println("--------------------------------------");
    }
   
    public String PreguntarPorTelefono(){
       System.out.println("¿Qué teléfono estás buscando? ");
       String telefono = sc.nextLine();
       return telefono;
    }

    public String pedirTelefono() {
        System.out.print("Introduce el teléfono nuevo del contacto: ");
        String telefono = sc.nextLine();
        return telefono;
    }

    public String pedirNombre() {
        System.out.print("Introduce el nuevo nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public String pedirApellido() {
        System.out.print("Introduce el nuevo apellido: ");
        String apellido = sc.nextLine();
        return apellido;
    }
    
    public int elegirPosicion(){
        System.out.println("¿Qué posición desea borrar?");
        int posicion = sc.nextInt();
        sc.nextLine();
        return posicion;
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
    
    
    
    public void agendaBorrada(){
        System.out.println("La agenda se ha borrado con éxito");
        System.out.println("---------------------------------");
    }
    
    public void agendaNoBorrada(){
        System.out.println("La agenda no se ha borrado (no había contactos)");
        System.out.println("-----------------------------------------------");
    }
    
    public void contactoBorrado(){
        System.out.println("El contacto ha sido borrado con éxito");
        System.out.println("-------------------------------------");
    }
    
    public void contactoNoBorrado(){
        System.out.println("El contacto no ha sido borrado");
        System.out.println("------------------------------");
    }
    
    public String añadirDescripcion(){
        System.out.println("A continuación escriba la descripción a su cita:");
        String descripcion = sc.nextLine();
        return descripcion;
    }    
    
    public String inicio(){
        System.out.println("Escribe una opcion:");
        System.out.println("-------------------");
        System.out.println("crearContacto");
        System.out.println("buscarContacto");
        System.out.println("actualizarContacto");
        System.out.println("borrarContacto");
        System.out.println("Alarmas");
        System.out.println("salir");
        System.out.println("-------------------");
        String orden = sc.nextLine();
        return orden;
    }
    
    public String inicioBusqueda() {
        System.out.println("Escribe una opcion:");
        System.out.println("-------------------");
        System.out.println("buscarPorNombre");
        System.out.println("buscarPorTelefono");
        System.out.println("mostrarContactos");
        System.out.println("volverContactos");
        System.out.println("-------------------");
        String orden = sc.nextLine();
        return orden;
    }
    
    public String inicioBorrado() {
        System.out.println("Escribe una opcion:");
        System.out.println("--------------------------");
        System.out.println("borrarContactoDadaPosicion");
        System.out.println("borrarContactoDadoNombre");
        System.out.println("borrarAgendaCompleta");
        System.out.println("volverContactos");
        System.out.println("--------------------------");
        String orden = sc.nextLine();
        return orden;
    }
    
    public String inicioAlarmas(){
        System.out.println("Escribe una opcion:");
        System.out.println("-------------------");
        System.out.println("crearCita");
        System.out.println("listarCita");
        System.out.println("buscarCita");
        System.out.println("borrarCita");
        System.out.println("volverContactos");
        System.out.println("-------------------");
        String orden = sc.nextLine();
        return orden;
    }

    public void HechoCorrectamente() {
        System.out.println("La tarea se ha realizado correctamente");
        System.out.println("Volviendo al menú principal...");
        System.out.println("--------------------------------------");
    }

    public void volverContactos(){
        System.out.println("Volviendo al menú de contactos...");
        System.out.println("---------------------------------");
    }
    
    public void salirPrograma(){
        System.out.println("Hasta la próxima!!!");
    }

}
