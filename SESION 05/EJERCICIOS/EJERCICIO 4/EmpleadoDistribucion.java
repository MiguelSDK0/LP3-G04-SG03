/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;

/**
 *
 * @author user
 */
public class EmpleadoDistribucion extends Asalariado{
    private String region;
    
    public EmpleadoDistribucion(String region, String nombre, long dni, int diasVacaciones, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    @Override
    public String toString() {
        return "Empleado de Distribucion\n" +
                "Dni: " + getDni() + "\n" + 
                "Nombre: " + getNombre() + "\n" + 
                "Vacaciones: " + getDiasVacaciones() + 
                " Zona: " + region + "\n" + 
                "Salario: " + getSalarioBase() * 1.10 + "\n";
    }
}
