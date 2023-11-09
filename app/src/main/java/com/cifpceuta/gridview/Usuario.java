package com.cifpceuta.gridview;

public class Usuario {
    private int imagen;
    private String nombre;
    public Usuario(int imagen, String nombre){
        this.imagen=imagen;
        this.nombre=nombre;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }
}
