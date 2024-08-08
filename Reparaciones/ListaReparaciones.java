/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.Queue;

/**
 *
 * @author Student
 */
public class ListaReparaciones {
    private Queue<Reparacion> reparacionesQueue;
    
    public void agregarReparacion(Reparacion reparacion) {
        reparacionesQueue.offer(reparacion);
    }
    public Reparacion buscarPorId(int id) {
        for (Reparacion reparacion : reparacionesQueue) {
            if (reparacion.getId() == id) {
                return reparacion;
            }
        }
        return null;
    }
    public void eliminarReparacionPorId(int id) {
        Reparacion reparacion = buscarPorId(id);
        if (reparacion != null) {
            reparacionesQueue.remove(reparacion);
            
        }
    }
}
