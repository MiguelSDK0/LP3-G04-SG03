/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontactos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("------MENU------");
            System.out.println("1. Aniadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contactos");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opcion: ");
            int opc = entrada.nextInt();
            entrada.nextLine();
            
            switch (opc) {
                case 1:
                    System.out.println("Nombre del contacto: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Telefono del contacto: ");
                    String telefono = entrada.nextLine();
                    System.out.println("Direccion del contacto: ");
                    String direccion = entrada.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                    listaContactos.add(nuevoContacto);
                    System.out.println("Contacto creado");
                    break;
                case 2:
                    System.out.println("Introduce el nombre del contacto a buscar: ");
                    String nombreBusqueda = entrada.nextLine();
                    boolean encontrado = false;
                    for (Contacto contacto : listaContactos) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("Informacion del contacto:");
                            System.out.println(contacto);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no existe");
                    }
                    break;
                case 3:
                    System.out.print("Introduce el nombre del contacto a modificar: ");
                    String nombreModificar = entrada.nextLine();
                    encontrado = false;
                    for (Contacto contacto : listaContactos) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Nuevo nombre: ");
                            String nuevoNombre = entrada.nextLine();
                            System.out.println("Nuevo telefono: ");
                            String nuevoTelefono = entrada.nextLine();
                            System.out.println("Nueva direccion: ");
                            String nuevaDireccion = entrada.nextLine();
                            contacto.setNombre(nuevoNombre);
                            contacto.setTelefono(nuevoTelefono);
                            contacto.setDireccion(nuevaDireccion);
                            System.out.println("Contacto modificado");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no existe");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el nombre del contacto para borrar: ");
                    String nombreBorrar = entrada.nextLine();
                    for (int i = 0; i < listaContactos.size(); i++) {
                        if (listaContactos.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {
                            listaContactos.remove(i);
                            System.out.println("Contacto borrado");
                            break;
                        }
                    }
                    break;
                case 5:
                    listaContactos.clear();
                    System.out.println("Contactos borrados");
                    break;
                case 6:
                    System.out.println("Lista de contactos:");
                    for (Contacto contacto : listaContactos) {
                        System.out.println(contacto);
                    }
                    break;
                case 7:
                    entrada.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }
    }
}

