/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Contacts {
    private Dictionary contactsDictionary;

    public Contacts() {
        this.contactsDictionary = new Dictionary();
    }

    public void agregarContacto(String dni, String datosPersona) {
        contactsDictionary.add(dni, datosPersona);
    }

    public boolean eliminarContacto(String dni) {
        return contactsDictionary.delete(dni);
    }
    
    public String obtenerContacto(String dni) {
        try {
            return contactsDictionary.getValue(dni);
        } catch (ObjectNoExist e) {
            return "Contacto no encontrado";
        }
    }
    
    public void mostrarContactos() {
        System.out.println("List of Contacts:");
        System.out.println(contactsDictionary.toString());
    }
}
