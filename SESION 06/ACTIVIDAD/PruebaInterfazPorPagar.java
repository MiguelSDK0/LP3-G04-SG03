/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_6;

/**
 *
 * @author User
 */
public class PruebaInterfazPorPagar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PorPagar[] objetosPorPagar = new PorPagar[5];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(24, 100);
        
        System.out.println("Facturas y Empleados procesados en forma polimorfica: \n");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println(porPagarActual.toString() + "\n");
        }
    }
}
