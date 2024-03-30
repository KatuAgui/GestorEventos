/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeeventos;

import java.util.ArrayList;

/*
1.Define una clase Evento que encapsule(private, guardar) la información de los eventos, como el título,
la descripción, la fecha, la hora de inicio y fin, el lugar, la capacidad máxima de
asistentes, la lista de asistentes registrados y el precio de la entrada. 
Implementa métodos para gestionar las inscripciones de los asistentes, 
como permitir la inscripción, cancelar la inscripción y 
verificar la disponibilidad de plazas.
 */
public class Evento {
    private String titulo;
    private String descripcion;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private int capacidadMaximaAsistente;
    private double precioEntrada;
    private ArrayList<Asistente> asistentes;

    public Evento(String titulo, String descripcion, String fecha, String horaInicio, String horaFin, int capacidadMaxima, double precioEntrada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.capacidadMaximaAsistente = capacidadMaxima;
        this.precioEntrada = precioEntrada;
        this.asistentes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getCapacidadMaxima() {
        return capacidadMaximaAsistente;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaximaAsistente = capacidadMaxima;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    
    public void permitirInscripcion(Asistente asistente){
        if(asistentes.contains(asistente)){
            System.out.println("Ya esta inscrito");
        }else{
            if(asistentes.size() < capacidadMaximaAsistente){
            asistentes.add(asistente);
                System.out.println("Inscripcion exitosa para " + asistente.getNombre() + "al evento " + titulo);
            }else{
                System.out.println("No hay plazas disponibles para el evento " + titulo);
            }
        }
        
    }
    
    public void cancelarInscripcion(Asistente asistente) {
        if(asistentes.contains(asistente)){ //true
            asistentes.remove(asistente);
            System.out.println("La inscripcion de " + asistente.getNombre() + "Ha sido eliminada");
        }else{
            System.out.println(asistente.getNombre() + " no se encuentra registrado en este evento");
        }
    }
    
    public boolean verificarDisponibilidadPlazas() {
        return asistentes.size() < capacidadMaximaAsistente;
    }
    
    
    
}
