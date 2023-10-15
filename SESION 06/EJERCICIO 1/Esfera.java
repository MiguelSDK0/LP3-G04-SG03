/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Esfera extends FiguraTridimensional{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public void obtenerVolumen() {
        System.out.println("El volumen de la esfera es: " + (4/3) * Math.PI * radio * radio * radio);
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area de la esfera es: " + 4 * Math.PI * radio * radio);
    }
}
