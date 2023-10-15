/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_6;

/**
 *
 * @author User
 */
public class EmpleadoAsalariado extends Empleado implements PorPagar {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    public void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

