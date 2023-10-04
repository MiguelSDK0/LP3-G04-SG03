/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;

/**
 *
 * @author user
 */
public class EmpleadoProduccion extends Asalariado{
    private String turno;
    
    public EmpleadoProduccion(String turno, String nombre, long dni, int diasVacaciones, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }
    
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String toString() {
        return "Empleado de Produccion\n" +
                "Dni: " + getDni() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Vacaciones: " + getDiasVacaciones() +
                " Turno: " + turno + "\n" +
                "Salario: " + getSalarioBase() * 1.15 + "\n";
    }
}