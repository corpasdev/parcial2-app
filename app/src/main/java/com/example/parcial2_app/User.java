package com.example.parcial2_app;

import java.io.Serializable;

public class User implements Serializable {

    private String nombre;
    private String genero;
    private String estado;
    private String planeta;
    private String ciudad;
    private String especie;
    private String imagen;

    public User(String nombre, String genero, String estado, String planeta, String ciudad, String especie, String imagen) {
        this.nombre = nombre;
        this.genero = genero;
        this.estado = estado;
        this.planeta = planeta;
        this.ciudad = ciudad;
        this.especie = especie;
        this.imagen = imagen;
    }

    public User(String imagen, String nombre, String estado, String especie) {
        this.nombre = nombre;
        this.estado = estado;
        this.especie = especie;
        this.imagen = imagen;
    }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPlaneta() {
            return planeta;
        }

        public void setPlaneta(String planeta) {
            this.planeta = planeta;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
}
