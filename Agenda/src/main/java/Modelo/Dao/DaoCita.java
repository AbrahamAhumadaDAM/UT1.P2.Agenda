/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.Pojos.Cita;
import Modelo.Pojos.Contacto;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 *
 * @author pablo_proyecto
 */
public class DaoCita {
    private HashMap<LocalDateTime, Cita> citas = new HashMap<>(); 
    
    public void crearCita(String descripcion, LocalDateTime fechaHora, Contacto contacto){
        Cita citaNueva = new Cita(descripcion, fechaHora, contacto);
        citas.put(fechaHora, citaNueva);
    }
    public void borrarCita(LocalDateTime fechaHora){
        citas.remove(fechaHora);
    }
    public Cita obtenerCita(LocalDateTime fechaHora){
        return citas.get(fechaHora);
    }
    public HashMap<LocalDateTime, Cita> listaCitas(){
        return citas;
    }
}
