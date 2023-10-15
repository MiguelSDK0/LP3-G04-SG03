/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Cubo extends FiguraTridimensional{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public void obtenerVolumen() {
        System.out.println("El volumen del cubo es: " + lado * lado * lado);
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area del cubo es: " + 6 * lado * lado);
    }    
}
