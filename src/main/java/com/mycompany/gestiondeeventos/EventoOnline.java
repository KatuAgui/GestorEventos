/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeeventos;

/**
2.Extiende la clase Evento para crear subclases EventoOnline y EventoPresencial.
* EventoOnline representa eventos virtuales y debe tener un atributo adicional
* para almacenar la URL del evento en línea.
 */
public class EventoOnline extends Evento{
    private String urlEvento;
    
    public EventoOnline(String titulo, String descripcion, String fecha, String horaInicio, String horaFin, int capacidadMaxima, double precioEntrada, String urlEvento){
        super(titulo, descripcion, fecha, horaInicio, horaFin, capacidadMaxima,precioEntrada);
        this.urlEvento = urlEvento;
    }

    public String getUrlEvento() {
        return urlEvento;
    }

    public void setUrlEvento(String urlEvento) {
        this.urlEvento = urlEvento;
    }
    
    
    
}
