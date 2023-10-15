/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_6;

/**
 *
 * @author User
 */
public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format("factura:\nnumero de pieza: %s (%s)\ncantidad: %d\nprecio por articulo: $%,.2f\npago vencido: $%,.2f", obtenerNumeroPieza(), obtenerDescripcionPieza(), obtenerCantidad(), obtenerPrecioPorArticulo(), obtenerMontoPago());
    }
}

