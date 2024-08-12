/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;
import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class ListaVehiculos {
    private ArrayList<Vehiculo> listaVehiculos;

    public ListaVehiculos() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getMatricula().equals(matricula)) {
                listaVehiculos.remove(v);
                return true;
            }
        }
        return false; 
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v; 
            }
        }
        return null;
    }

    public ArrayList<Vehiculo> obtenerListaVehiculos() {
        return listaVehiculos;
    }

    public void mostrarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos en la lista.");
        } else {
            for (Vehiculo v : listaVehiculos) {
                System.out.println(v.toString());
            }
        }
    }
}
