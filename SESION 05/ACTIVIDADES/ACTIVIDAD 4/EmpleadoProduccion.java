/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;

/**
 *
 * @author user
 */
public class EmpleadoProduccion extends Asalariado{
    private String turno;
    
    public EmpleadoProduccion(String turno, String nombre, long dni, int diasVacaciones){
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }
    
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
