/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TestHerencia {
    public static void main(String[] args) {
        ArrayList<Asalariado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar informacion de empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de empleado:");
                    System.out.println("1. Asalariado");
                    System.out.println("2. Empleado de produccion");
                    System.out.println("3. Empleado de distribucion");
                    int tipoEmpleado = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el DNI: ");
                    long dni = scanner.nextLong();
                    System.out.print("Ingrese los dias de vacaciones: ");
                    int diasVacaciones = scanner.nextInt();
                    System.out.print("Ingrese el salario base: ");
                    double salarioBase = scanner.nextDouble();
                    
                    if (tipoEmpleado == 1) {
                        empleados.add(new Asalariado(nombre, dni, diasVacaciones, salarioBase));
                    } else if (tipoEmpleado == 2) {
                        System.out.print("Ingrese el turno: ");
                        String turno = scanner.next();
                        empleados.add(new EmpleadoProduccion(turno, nombre, dni, diasVacaciones, salarioBase));
                    } else if (tipoEmpleado == 3) {
                        System.out.print("Ingrese la region: ");
                        String region = scanner.next();
                        empleados.add(new EmpleadoDistribucion(region, nombre, dni, diasVacaciones, salarioBase));
                    }
                    break;
                case 2:
                    System.out.println("-----Informacion de empleados-----");
                    for (Asalariado empleado : empleados) {
                        System.out.println(empleado.toString());
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
