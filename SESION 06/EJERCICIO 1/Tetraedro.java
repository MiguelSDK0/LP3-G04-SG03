/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Tetraedro extends FiguraTridimensional {
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    @Override
    public void obtenerVolumen() {
        System.out.println("El volumen del Tetraedro es: " + lado * lado * lado * (Math.sqrt(2)/12));
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area del Tetraedo es: " + lado * lado * Math.sqrt(3));
    }
}
