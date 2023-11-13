/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD;

/**
 *
 * @author daryo
 */
public class Alumno extends Persona1{
    private Fecha fechaMatricula;

    public Alumno(Fecha fechaMatricula, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.fechaMatricula = fechaMatricula;
    }

    public Alumno(){
    }
    
    public Fecha getMatricula(){
        return fechaMatricula;
    }
    
    public void setMatricula(Fecha fechaMatricula){
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setMes(fechaMatricula.getAnio());
    }
}
