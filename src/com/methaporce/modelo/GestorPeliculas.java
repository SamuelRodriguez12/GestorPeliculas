package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPeliculas {

    ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    int i=0;

    public void agregarPelicula(int idPelicula, String nombrePelicula, boolean disponibilidad){
        Pelicula nuevaPelicula = new Pelicula(idPelicula, nombrePelicula, disponibilidad);
        listaPelicula.add(nuevaPelicula);
    }

    public void mostrarPeliculas(){
        System.out.println("Listado De Peliculas: \n"+listaPelicula);
    }

    public void eliminarPeliculas(int id){
        int mensaje=0;
        for (i=0;i<listaPelicula.size();i++){
            if (listaPelicula.get(i).getIdPelicula()==id){
                listaPelicula.remove(i);
                mensaje=0;
                System.out.println("El elemento se elimino con exito");
                break;
            }else{
                mensaje=1;
            }
        }
        if (mensaje==1){
            System.out.println("El ID ingresado no existe");
        }
    }

    public void mostrarDisponibles(){
        System.out.println("Peliculas Disponibles:");
        for (i=0;i< listaPelicula.size();i++){
            if (listaPelicula.get(i).isDisponibilidad()){
                System.out.println(listaPelicula.get(i).toString());
            }
        }
    }

    public void mostrarNoDisponibles(){
        System.out.println("Peliculas NO Disponibles:");
        for (i=0;i< listaPelicula.size();i++){
            if (listaPelicula.get(i).isDisponibilidad()==false){
                System.out.println(listaPelicula.get(i).toString());
            }
        }
    }

    public void actualizarPeliculas(int id){
        boolean disponible=true;
        int mensaje=0;
        Scanner teclado = new Scanner(System.in);
        for(i=0;i<listaPelicula.size();i++){
            if(listaPelicula.get(i).getIdPelicula()==id){
                System.out.println("Actualiza la disponibilidad de la pelicula (True o false): ");
                disponible = teclado.nextBoolean();
                Pelicula actualizacion = new Pelicula(listaPelicula.get(i).getIdPelicula(), listaPelicula.get(i).getNombrePelicula(), disponible);
                mensaje=0;
                listaPelicula.set(i, actualizacion);
                System.out.println("El elemento se actualizo con exito");
                break;
            }else {
                mensaje = 1;
            }
        }
        if (mensaje==1){
            System.out.println("El ID ingresado no existe");
        }
    }
}
