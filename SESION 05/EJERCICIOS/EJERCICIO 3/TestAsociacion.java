/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TestAsociacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Mi Banco");
        ArrayList<Persona> clientes = new ArrayList<>();

        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Mostrar clientes por su tipo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el tipo de cliente(C, B o E): ");
                    char tipoCliente = scanner.next().charAt(0);
                    scanner.nextLine();
                    Persona cliente = new Persona(Persona.getNumC(), nombre, apellido, tipoCliente);
                    clientes.add(cliente);
                    banco.agregarCliente(cliente);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del cliente a dar de baja: ");
                    String nombreBaja = scanner.nextLine();
                    Persona clienteBaja = null;
                    for (Persona p : clientes) {
                        if (p.getNombre().equals(nombreBaja)) {
                            clienteBaja = p;
                            break;
                        }
                    }
                    if (clienteBaja != null) {
                        clientes.remove(clienteBaja);
                        banco.darBajaCliente(clienteBaja);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Persona p : clientes) {
                        if (p.getNombre().equals(nombreBuscar)) {
                            banco.buscarCliente(p);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el tipo de cliente a mostrar (C, B o E): ");
                    char tipoMostrar = scanner.next().charAt(0);
                    banco.clientesTipo(tipoMostrar);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
