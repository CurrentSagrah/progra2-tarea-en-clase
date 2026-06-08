package com.sucursales;
import java.util.Random;

public final class Curso {
    private final String nombre;
    private final int capacidadMaxima;
    private final int inscritos;

    public Curso(String nombre, int inscritos) {
        this.nombre = nombre;

        
        Random rand = new Random();
        this.capacidadMaxima = rand.nextInt(16) + 20;

        
        if (inscritos > capacidadMaxima) {
            System.out.println("El número de alumnos no puede exceder a " + capacidadMaxima);
            this.inscritos = capacidadMaxima;
        } else {
            this.inscritos = inscritos;
        }
    }

    @Override
    public String toString() {
        return "Curso: " + nombre +
               ", Inscritos: " + inscritos +
               ", Capacidad Máxima: " + capacidadMaxima;
    }
}