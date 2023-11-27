/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Obtener informacion de contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dni = entrada.nextLine();
                    System.out.print("Ingrese informacion de contacto: ");
                    String informacionContacto = entrada.nextLine();
                    contacts.agregarContacto(dni, informacionContacto);
                    System.out.println("Contacto agregado exitosamente");
                    break;
                case 2:
                    System.out.print("Ingrese DNI del contacto a eliminar: ");
                    String eliminarDNI = entrada.nextLine();
                    if (contacts.eliminarContacto(eliminarDNI)) {
                        System.out.println("Contacto eliminado exitosamente");
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese DNI para obtener la informacion del contacto: ");
                    String obtenerDNI = entrada.nextLine();
                    String infoContacto = contacts.obtenerContacto(obtenerDNI);
                    System.out.println("Informacion del contacto: " + infoContacto);
                    break;
                case 4:
                    contacts.mostrarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 5);

        entrada.close();
    }
}
