/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeeventos;

/**
 2. EventoPresencial representa eventos físicos y debe tener atributos
 * adicionales para almacenar la dirección y capacidad del lugar del evento.
 */
public class EventoPresencial extends Evento {
    private String direccion;
    private int capacidadPersonas;
    
    public EventoPresencial(String titulo, String descripcion, String fecha, String horaInicio, String horaFin, int capacidadMaxima, double precioEntrada,String direccion, int capacidadPersonas){
        super(titulo, descripcion, fecha, horaInicio, horaFin, capacidadMaxima,precioEntrada);
        this.direccion = direccion;
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
    
    
}
