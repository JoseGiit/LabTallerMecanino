/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import java.util.ArrayList;

/**
 *
 * @author jdarg
 */
public class ListaMecanicos {
    private ArrayList<Mecanico> mecanicos;
    
    public ListaMecanicos() {
        this.mecanicos = new ArrayList<>();
    }


    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }


    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }


    public void mostrarMecanicos() {
        for (Mecanico mecanico : mecanicos) {
            System.out.println(mecanico);
        }
    }


   
    public Mecanico buscarMecanicoPorId(String id) {
    for (Mecanico mecanico : mecanicos) {
        if (mecanico.getId().equals(id)) {
            return mecanico;
        }
    }
        return null;
    }


    public boolean eliminarMecanicoPorId(String id) {
        Mecanico mecanicoAEliminar = buscarMecanicoPorId(id);
        if (mecanicoAEliminar != null) {
            mecanicos.remove(mecanicoAEliminar);
            return true; 
        }
        return false; 
    }
    
}
