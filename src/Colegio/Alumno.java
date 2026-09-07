/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colegio;

import java.util.HashSet;

/**
 *
 * @author ramir
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    // Método para agregar materia (evita duplicados gracias al HashSet)
    public void agregarMateria(Materia m) {

        if (materias.contains(m)) {
            System.out.println("Ya estas inscripto a \""+m.getNombre()+"\" intenta con otra materia.");
        } else{materias.add(m);}

    }

    // Método para saber la cantidad de materias
    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }

}
