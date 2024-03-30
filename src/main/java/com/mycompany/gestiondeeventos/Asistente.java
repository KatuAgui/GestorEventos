/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeeventos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Define una clase Asistente que encapsule la información de los asistentes a los eventos,
como el nombre, el correo electrónico, el número de teléfono y la información adicional
relevante. 
*/
public class Asistente {
    private String nombre;
    private String correo;
    private String telefono;
    
    public Asistente(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public Asistente(){}
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void crearAsistente(Scanner scan, ArrayList<Asistente> asistentes){
        System.out.println("Registro de nuevo asistente");
        System.out.println("Ingrese el nombre del asistente");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el correo del asistente");
        String correo = scan.nextLine();
        System.out.println("Ingrese el telefono del asistente");
        String telefono = scan.nextLine();
        Asistente s = new Asistente(nombre,correo,telefono);
        asistentes.add(s);
        System.out.println("Asistente registrado correctamente");
    }
    
    public void mostrarAsistente(ArrayList<Asistente> asistentes){
        System.out.println("Lista de asistentes");
        for(Asistente asistente : asistentes){
            System.out.println("Nombre: " + asistente.getNombre());
            System.out.println("Correo: " + asistente.getCorreo());
            System.out.println("Telefono: " + asistente.getTelefono());
            System.out.println("-----------------------------------");
        }
    }
    
    public void buscarAsistenteNombre(Scanner scan, ArrayList<Asistente> asistentes){
        System.out.println("Busqueda de Asistente");
        System.out.println("Ingresa el nombre del asistente");
        String nombre = scan.nextLine();
        boolean encontrado = false;
         for(Asistente asistente : asistentes){
             if(asistente.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Nombre: " + asistente.getNombre());
                System.out.println("Correo: " + asistente.getCorreo());
                System.out.println("Telefono: " + asistente.getTelefono());
                encontrado = true;
                break;
             }
         }
         if(!encontrado){
             System.out.println("No se encontro el asistente");
         }
    }
    
    
}
