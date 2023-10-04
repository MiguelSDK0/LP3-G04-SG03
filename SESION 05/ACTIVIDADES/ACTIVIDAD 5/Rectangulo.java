package sesion_05_Actividades;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    
    public double area(){
        return this.base * this.altura;
    }
}
