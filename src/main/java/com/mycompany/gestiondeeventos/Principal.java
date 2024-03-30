/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeeventos;

import java.util.ArrayList;
import java.util.Scanner;

/**
4.En la función main(), proporciona un menú completo que permita a los 
* usuarios realizar todas las operaciones disponibles, como crear eventos,
* buscar eventos, inscribir asistentes a eventos, cancelar inscripciones,
* gestionar asistentes, etc. //salir
* 3.registrar nuevos asistentes, buscar asistentes por correo electrónico
* o número de teléfono, editar la información de los asistentes y eliminar 
* asistentes.
 */
public class Principal {

   
    private ArrayList<Evento> eventos;
    private ArrayList<Asistente> asistentes;
    
    
    public Principal(){
        eventos = new ArrayList<>();
        asistentes = new ArrayList<>();
    }
    
    public static void main(String[] args){
        EventoPresencial eventopresencial1 = new EventoPresencial("Reunion Familiar", "Una reunion en familia", "2024-04-10","10:00", "12:00",15,100.0,"Lugar del evento",50);
        Asistente asistente1 = new Asistente("Luis Aguirre", "luis@gmail.com", "8900-0090");
       eventopresencial1.permitirInscripcion(asistente1);
       eventopresencial1.permitirInscripcion(asistente1);
       
       Scanner scan = new Scanner(System.in);
       Principal principal = new Principal();
       
       
       int opcion;
       do {
           System.out.println("----------------------------------");
           System.out.println("Menu Principal");
           System.out.println("1. Gestionar Asistente");
           System.out.println("2. Crear Evento");
           System.out.println("3. Buscar evento por titulo");
           System.out.println("4. Inscribir un asistente");
           System.out.println("5. Cancelar un asistente");
           System.out.println("6. Salir del menu");
           System.out.println("----------------------------------");
           System.out.println("Selecciona una opcion: ");
           opcion = scan.nextInt(); //1 //uno
           scan.nextLine();
           switch(opcion){
               case 1:
                   principal.gestionarAsistentes(scan);
                   break;
               case 2:
                   //principal.crearEvento();
                   break;
               case 3:
                   //principal.buscarEventoTitulo();
                   break;
                   
               case 4: 
                   //principal.inscribirAsistente();
                   break;
               case 5:
                   //principal.cancelarAsistente();
                   break;
               case 6:
                   System.out.println("Saliendo del sistema ...");
                   break;
               default:
                   System.out.println("Opcion no valida. Porfavor seleccione una opcion valida");
          
           }
          // scan.close();
       }while(opcion != 6);
        
    
    }
    
    public void gestionarAsistentes(Scanner scan){
        int opcion;
       do {
           System.out.println("----------------------------------");
           System.out.println("Menu Pra Gestionar Asistente");
           System.out.println("1. Crear un nuevo asistente");
           System.out.println("2. Buscar Asistente por correo");
           System.out.println("3. Editar informacion del asistente");
           System.out.println("4. Borrar asistente");
           System.out.println("5. Mostrar todos los asistentes");
           System.out.println("6. Salir del menu");
           System.out.println("----------------------------------");
           System.out.println("Selecciona una opcion: ");
           opcion = scan.nextInt(); //1 //uno
           Asistente asis = new Asistente();
           scan.nextLine();
           switch(opcion){
               case 1:
                   asis.crearAsistente(scan,asistentes);
                   break;
               case 2:
                   asis.buscarAsistenteNombre(scan, asistentes);
                   break;
               case 3:
                   editarInformacionAsistente(scan);
                   break;
                   
               case 4: 
                   //principal.elimininarAsistente();
                   break;
               case 5:
                   asis.mostrarAsistente(asistentes);
                   break;
               case 6:
                   System.out.println("Saliendo del sistema ...");
                   break;
               default:
                   System.out.println("Opcion no valida. Porfavor seleccione una opcion valida");
          
           }
       }while(opcion != 6);
    }
    
    public void editarInformacionAsistente(Scanner scan){
        System.out.println("Editar Informacion del asistente");
        System.out.println("Ingrese el nombre del asistente que desea editar");
        String nombre = scan.nextLine();
        boolean encontrado = false;
         for(Asistente asistente : asistentes){
             if(asistente.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("DATOS REGISTRADOS");
                System.out.println("Nombre: " + asistente.getNombre());
                System.out.println("Correo: " + asistente.getCorreo());
                System.out.println("Telefono: " + asistente.getTelefono());
                System.out.println("Ingrese los nuevos datos que desea cambiar");
                System.out.println("Ingrese el nuevo correo");
                String nuevoCorreo = scan.nextLine();
                asistente.setCorreo(nuevoCorreo);
                encontrado = true;
                break;
             }
         }
         if(!encontrado){
             System.out.println("No se encontro el asistente");
         }
    
    }
    
}
