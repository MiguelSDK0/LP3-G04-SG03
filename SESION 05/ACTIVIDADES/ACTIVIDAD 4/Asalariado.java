/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;

/**
 *
 * @author user
 */
public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    
    public Asalariado(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public long getDni() {
        return dni;
    }
    
    public int getDiasVacaciones() {
        return diasVacaciones;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
}
