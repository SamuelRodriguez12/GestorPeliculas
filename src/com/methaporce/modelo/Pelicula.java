package com.methaporce.modelo;

public class Pelicula {
    private int idPelicula = 0;
    private String nombrePelicula;
    private boolean disponibilidad = true;

    public Pelicula(int idPelicula, String nombrePelicula, boolean disponibilidad){
        this.idPelicula=idPelicula;
        this.nombrePelicula=nombrePelicula;
        this.disponibilidad=disponibilidad;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String toString() {
        return "com.methaporce.modelo.Pelicula{" +
                "idPelicula=" + idPelicula +
                ", nombrePelicula='" + nombrePelicula + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}'+"\n";
    }
}
