package Modelo.Pojos;

import java.time.LocalDateTime;

/**
 *
 * @author pablo_proyecto
 */
public class Cita {
    private String descripcion;
    private LocalDateTime fechaHora;
    private Contacto contacto;

    public Cita(String descripcion, LocalDateTime fechaHora, Contacto contacto) {
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.contacto = contacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Cita: "+ descripcion + " a las: " + fechaHora + "con el contacto: " + contacto;
    }
}
