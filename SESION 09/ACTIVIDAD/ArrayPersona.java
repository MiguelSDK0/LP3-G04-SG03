/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD;

/**
 *
 * @author daryo
 */
public class ArrayPersona {
    private Persona arreglo[];
    private final int max = 128;
    private int tamano = 0;

    public ArrayPersona() {
        this.arreglo = new Persona[this.max];
    }

    public void printArray(String nombre) {
        for (int i = 0; i < this.tamano; i++) {
            if (this.arreglo[i].getNombre().equals(nombre)) {
                System.out.println(this.arreglo[i]);
            }
        }
    }

    public void addArray(Persona persona) {
        if (this.tamano == max) {
            System.exit(1);
        }
        this.arreglo[this.tamano++] = persona;
    }
}
