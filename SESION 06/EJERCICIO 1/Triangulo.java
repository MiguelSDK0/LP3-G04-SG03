/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Triangulo extends FiguraBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void obtenerArea() {
        System.out.println("El area del triangulo es: " + (base * altura)/2);
    }
}
