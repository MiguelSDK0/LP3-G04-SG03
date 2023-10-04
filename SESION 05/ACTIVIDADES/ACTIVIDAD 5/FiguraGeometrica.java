/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;

/**
 *
 * @author user
 */
public abstract class FiguraGeometrica {
    private String nombre;
    abstract public double area();
    
    public FiguraGeometrica (String nombreFigura) {
        this.nombre = nombreFigura;
    }

    final public boolean mayorQue (FiguraGeometrica otra) {
        return this.area()>otra.area();
    }

    final public String toString(){
        return this.nombre + " con area " + this.area();
    } 
}
