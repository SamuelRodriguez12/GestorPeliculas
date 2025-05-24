package com.methaporce.vista;

import java.util.Scanner;
import com.methaporce.modelo.GestorPeliculas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nueva funcionalidad");
        int indice=0;
        int id=0;
        String nombre;
        boolean disponibilidad=true;
        GestorPeliculas gestion = new GestorPeliculas();
        Scanner leer=new Scanner(System.in);
        System.out.println("Hola mundo");
        do {
            System.out.println("/////////Opciones/////////");
            System.out.println("1-Agregar una pelicula");
            System.out.println("2-Eliminar una pelicula");
            System.out.println("3-Mostrar peliculas");
            System.out.println("4-Mostrar peliculas disponibles");
            System.out.println("5-Mostrar peliculas no disponibles");
            System.out.println("6-Actualizar disponibilidad");
            System.out.println("7-Salir");
            System.out.println("Ingresa el numero de la opcion a realizar: ");
            indice=leer.nextInt();
            switch (indice){
                case 1:
                    System.out.println("Ingresa el ID de la pelicula: ");
                    id=leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingresa el nombre de la pelicula: ");
                    nombre=leer.nextLine();
                    System.out.println("Ingresa (True o false) para indicar si se encuentra disponible: ");
                    disponibilidad=leer.nextBoolean();
                    gestion.agregarPelicula(id, nombre, disponibilidad);
                    break;
                case 2:
                    System.out.println("Ingresa el ID de la pelicula a eliminar: ");
                    id= leer.nextInt();
                    gestion.eliminarPeliculas(id);
                    break;
                case 3:
                    gestion.mostrarPeliculas();
                    break;
                case 4:
                    gestion.mostrarDisponibles();
                    break;
                case 5:
                    gestion.mostrarNoDisponibles();
                    break;
                case 6:
                    System.out.println("Ingresa el ID de la pelicula que quieres Actualizar: ");
                    id= leer.nextInt();
                    gestion.actualizarPeliculas(id);
                    break;
                case 7:
                    System.out.println("Vuelva Pronto");
                    break;
                default:
                    System.out.println("El valor ingresado es invalido");
                    break;
            }
        }while(indice!=7);
    }
}