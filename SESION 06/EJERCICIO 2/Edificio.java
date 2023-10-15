/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_2;

/**
 *
 * @author user
 */
public class Edificio implements ImpactoEcologico{
    private String categoria;
    private double energia;
    private double area;
    private double pisos;

    public Edificio(String categoria, double energia, double area, double pisos) {
        this.categoria = categoria;
        this.energia = energia;
        this.area = area;
        this.pisos = pisos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (energia * area)/pisos;
        double FACTOR_DE_EMISION = 0.5;
        double IMPACTO_ECOLOGICO = DATO_ACTIVIDAD * FACTOR_DE_EMISION;
        return IMPACTO_ECOLOGICO;
    }
}
