/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_6;

/**
 *
 * @author User
 */
public class Prestamo implements PorPagar {
    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public double obtenerMontoPago() {
        return numeroDeCuotas * montoDeCuota;
    }

    @Override
    public String toString() {
        return String.format("prestamo:\nnumero de cuotas: %d\nmonto de cuota: $%,.2f\npago vencido: $%,.2f", numeroDeCuotas, montoDeCuota, obtenerMontoPago());
    }
}

