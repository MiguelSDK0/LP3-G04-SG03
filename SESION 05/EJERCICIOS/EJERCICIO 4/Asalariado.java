/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;

/**
 *
 * @author user
 */
public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salarioBase;
    
    public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double calcularNomina() {
        return salarioBase;
    }
    
    @Override
    public String toString() {
        return "Empleado Asalariado\n" +
                "Dni: " + getDni() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Vacaciones: " + getDiasVacaciones() + " dias\n" +
                "Salario: " + calcularNomina() + "\n";
    }
}