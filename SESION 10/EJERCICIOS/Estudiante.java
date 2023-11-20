/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Cesar
 */
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(int dni, String nombres, String direccion, String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }
    public Estudiante(String nombres, String carrera) {
        super(nombres);
        this.carrera = carrera;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Estudiante estudiante = (Estudiante) obj;
        return this.getNombre().equals(estudiante.getNombre()) && this.carrera.equals(estudiante.carrera);
    }
}