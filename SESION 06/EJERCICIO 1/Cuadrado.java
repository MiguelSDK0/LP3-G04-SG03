/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Cuadrado extends FiguraBidimensional{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area del cuadrado es: " + lado * lado);
    }
}