/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;

/**
 *
 * @author User
 */
public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        if (motor != null) {
            return "Automovil con motor\n" +
                   "Placa: " + placa + "\n" +
                   "Nro motor: " + motor.getNumMotor() + "\n" +
                   "Nro puertas: " + numPuertas + "\n" +
                   "Marca: " + marca + "\n" +
                   "Modelo: " + modelo + "\n" +
                   "RPM: " + motor.getRevPorMin();
        } else {
            return "Automovil sin motor\n" +
                   "Placa: " + placa + "\n" +
                   "Nro puertas: " + numPuertas + "\n" +
                   "Marca: " + marca + "\n" +
                   "Modelo: " + modelo;
        }
    }
}

