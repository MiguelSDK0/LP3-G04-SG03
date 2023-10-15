/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_6;

/**
 *
 * @author User
 */
public abstract class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }
    @Override
    public abstract double obtenerMontoPago();

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s %s\nnumero de seguro social: %s\nsalario semanal: $%,.2f\npago vencido: $%,.2f", primerNombre, apellidoPaterno, numeroSeguroSocial, obtenerMontoPago(), obtenerMontoPago());
    }
}
