package controlador;

import Modelo.Dao.DaoCita;
import Modelo.Dao.DaoContacto;
import Vista.Vista;
import java.time.LocalDateTime;

/**
 *
 * @author abraham
 */
public class Controlador {

    private DaoContacto daoContacto;
    private DaoCita daoCita;
    private final Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void Iniciar(){
        String orden = "";
        do{
            orden = vista.inicio();
            switch(orden){
                case "crearContacto":
                    daoContacto.añadirContacto(vista.CrearContacto());
                    vista.HechoCorrectamente();
                    break;
                case "buscarContacto":
                    orden = vista.inicioBusqueda();
                    switch(orden){
                        case "buscarPorNombre":
                            daoContacto.buscarPorNombre(vista.PreguntarPorNombre());
                            vista.ContactoEncontrado();
                            vista.HechoCorrectamente();
                            break;
                        case "buscarPorTelefono":
                            daoContacto.buscarPorTelefono(vista.PreguntarPorTelefono());
                            vista.ContactoEncontrado();
                            vista.HechoCorrectamente();
                            break;
                        case "mostrarContactos":
                            daoContacto.mostrarContactos(daoContacto.getContactos());
                            break;
                        case "volverContactos":
                            vista.volverContactos();
                            break;
                    }
                    break;
                case "actualizarContacto":
                    daoContacto.actualizarContacto(vista.PreguntarPorTelefono(),vista.pedirNombre(),vista.pedirApellido(),vista.pedirTelefono());
                    vista.HechoCorrectamente();
                    break;
                case "borrarContacto":
                    orden = vista.inicioBorrado();
                    switch(orden){
                        case "borrarContactoDadaPosicion":
                            daoContacto.mostrarContactos(daoContacto.getContactos());
                            if(daoContacto.borrarContactoDadaPosicion(vista.elegirPosicion())){
                                vista.contactoBorrado();
                            } else {
                                vista.contactoNoBorrado();
                            }    
                            break;
                        case "borrarContactoDadoNombre":
                            daoContacto.mostrarContactos(daoContacto.getContactos());
                            if(daoContacto.borrarContactoDadoNombre(vista.PreguntarPorNombre())){
                                vista.contactoBorrado();
                            } else {
                                vista.contactoNoBorrado();
                            }
                            break;
                        case "borrarAgendaCompleta":
                            if(daoContacto.borrarAgendaCompleta()){
                                vista.agendaBorrada();
                            } else {
                                vista.agendaNoBorrada();
                            }
                            break;
                        case "volverContactos":
                            vista.volverContactos();
                            break;
                    }
                    break;
                case "Alarmas":
                    orden = vista.inicioAlarmas();
                    switch(orden){
                        case "crearCita":
                            daoCita.crearCita(vista.añadirDescripcion(), LocalDateTime.MAX, daoContacto.buscarPorTelefono(vista.PreguntarPorTelefono()));
                            break;
                        case "listarCitas":
                            daoCita.listaCitas();
                            break;
                        case "buscarCita":
                            daoCita.obtenerCita(LocalDateTime.MAX);
                            break;
                        case "borrarCita":
                            daoCita.borrarCita(LocalDateTime.MAX);
                            break;
                        case "volverContactos":
                            vista.volverContactos();
                            break;
                    }
                    break;
                case "salir":
                    vista.salirPrograma();
                    break;
            }
        }while(!orden.equalsIgnoreCase("salir"));
    }
}