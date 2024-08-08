/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

/**
 *
 * @author Student
 */
public class Reparacion {
    private int id;
    private String vehiculo;
    private String mecanico;
    private String fecha;
    private String descripcion;
    private String estado;

    
    public int getId() {
        return id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Reparacion(int id, String vehiculo, String mecanico, String fecha, String descripcion, String estado) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = "Pendiente"; //Estado inicial 
    }

    public Reparacion() {
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", vehiculo=" + vehiculo + ", mecanico=" + mecanico + ", fecha=" + fecha + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
}
