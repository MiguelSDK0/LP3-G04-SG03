/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_2;

/**
 *
 * @author user
 */
public class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private double peso;
    private double cambioCamaras;
    private double uso;

    public Bicicleta(String tipo, double peso, double cambioCamaras, double uso) {
        this.tipo = tipo;
        this.peso = peso;
        this.cambioCamaras = cambioCamaras;
        this.uso = uso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (peso*cambioCamaras)/uso;
        double FACTOR_DE_EMISION = 0.05;
        double IMPACTO_ECOLOGICO = DATO_ACTIVIDAD * FACTOR_DE_EMISION;
        return IMPACTO_ECOLOGICO;
    }
}
