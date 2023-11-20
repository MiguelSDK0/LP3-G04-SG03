/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTVIDADES;

/**
 *
 * @author Cesar
 */
public class Persona implements Comparable<Persona>{
    private int DNI;
    private String nombre;
    private String direccion;

    public Persona(int DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }
    
    @Override
    public String toString() {
        return "Persona[DNI = " + DNI + ", nombre = " + nombre + ", direccion = " + direccion + "]";
    }
}
