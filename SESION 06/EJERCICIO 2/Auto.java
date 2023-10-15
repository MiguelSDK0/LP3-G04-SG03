/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_2;

/**
 *
 * @author user
 */
public class Auto implements ImpactoEcologico {
    private String Modelo;
    private double gasolina;
    private double usoDiario;
    private double aniosVida;

    public Auto(String Modelo, double gasolina, double usoDiario, double aniosVida) {
        this.Modelo = Modelo;
        this.gasolina = gasolina;
        this.usoDiario = usoDiario;
        this.aniosVida = aniosVida;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (gasolina/usoDiario) * aniosVida;
        double FACTOR_DE_EMISION = 0.3;
        double IMPACTO_ECOLOGICO = DATO_ACTIVIDAD * FACTOR_DE_EMISION;
        return IMPACTO_ECOLOGICO;
    }
}
