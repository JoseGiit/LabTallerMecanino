/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class Mecanico {
    private int id;
    private String nombre;
    private String especialidad;
    private ArrayList<Mecanico> mecanicos;
    
    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }
    
    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }
    
    public void imprimirMecanicos() {
        for (Mecanico mecanico : mecanicos) {
            System.out.println(mecanico);
        }
    }
    
    public Mecanico buscarMecanicoPorId(int id) {
        for (Mecanico mecanico : mecanicos) {
            if (mecanico.getId() == id) {
                return mecanico;
            }
        }
        return null; 
    }

   

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }

    public Mecanico(int id, String nombre, String especialidad, ArrayList<Mecanico> mecanicos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.mecanicos = mecanicos;
    }

    public Mecanico() {
    }
    
    
    
    
}
