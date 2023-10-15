/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Circulo extends FiguraBidimensional{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area del circulo es: " + radio * radio * Math.PI);
    }
}