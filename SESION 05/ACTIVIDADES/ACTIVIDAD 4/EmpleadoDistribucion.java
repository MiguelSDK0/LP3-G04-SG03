/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;

/**
 *
 * @author user
 */
public class EmpleadoDistribucion extends Asalariado{
    private String region;
    
    public EmpleadoDistribucion(String region, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
}
