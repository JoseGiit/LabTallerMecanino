/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Luisk
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private int anioFabricacion;

    public Vehiculo(String matricula, String modelo, String marca, int anioFabricacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Vehiculo [Matrícula=" + matricula + ", Modelo=" + modelo + ", Marca=" + marca + ", Año de Fabricación=" + anioFabricacion + "]";
    }
}
