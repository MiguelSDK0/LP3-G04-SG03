/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

/**
 *
 * @author User
 */
public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta(int numero, double saldoInicial) {
        this.numero = numero;
        if (saldoInicial >= 50) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 50; 
        }
    }

    public Cuenta(int numero) {
        this.numero = numero;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad > 0 && this.saldo - cantidad >= 50) {
            this.saldo -= cantidad;
        }
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nro. Cuenta: " + numero + "         Saldo: " + saldo ;
    }
}