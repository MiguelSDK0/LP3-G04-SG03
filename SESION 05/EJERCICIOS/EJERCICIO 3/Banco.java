/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Banco {
    private String nombre;
    private Persona clientes[];
    
    public Banco(String nombre){
        this(nombre, 20);
    }
    
    public Banco(String nombre, int numcli) {
        this.nombre = nombre;
        this.clientes = new Persona[numcli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    
    public void agregarCliente(Persona persona) {
        if(buscarCliente(persona)) {
            System.out.println("El cliente ya se encuentra registrado");
        }else{
            int i;
            for(i = 0; i < this.clientes.length; i++){
                if(this.clientes[i] == null){
                    break;
                }
            }
            if(i >= this.clientes.length){
                System.out.println("Limites de clientes en el sistema");
            }else{
                this.clientes[i] = persona;
                System.out.println("   " +(i+1) + ") Cliente " + this.clientes[i].getNombre() + " agregado con exito.");
            }
        }
    }
    
    public void darBajaCliente(Persona persona){
        if(buscarCliente(persona)) {
            for(int i = 0; i < this.clientes.length; i++){
                if(this.clientes[i] != null){
                    if(this.clientes[i].equals(persona)){
                        this.clientes[i] = null;
                        System.out.println("Cliente " + persona.getNombre() + " " + persona.getApellido() + " eliminado correctamente.");
                    }
                }
            }
        }
    }
    
    public boolean buscarCliente(Persona persona){
        for(int i = 0; i < this.clientes.length; i++) {
            if(this.clientes[i] != null) {
                if(this.clientes[i].equals(persona)){
                    System.out.println("Cliente encontrado: " + persona);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo " + tipo + ":");
        for (Persona cliente : this.clientes) {
            if (cliente != null && cliente.getTipoCliente() == tipo) {
                System.out.println(cliente);
            }
        }
    }

    
    @Override
    public String toString() {
    String clientList = Arrays.stream(this.clientes)
        .filter(Objects::nonNull)
        .map(Object::toString)
        .collect(Collectors.joining("\n   ")); 
        return "Banco: " + nombre + "\n   " + clientList;
    }
}