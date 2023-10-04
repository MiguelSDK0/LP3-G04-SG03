/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;
/**
 *
 * @author user
 */
public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP", 2);
        Banco bbva = new Banco("BBVA");
        Persona Cesar = new Persona(2041, "Cesar", "Chambi");
        Persona Miguel = new Persona(1031, "Miguel", "Mamani");
        Persona Paul = new Persona(3051, "Paul", "Diaz");
        //Agregar clientes
        System.out.println("1) Agregando clientes: ");
        bcp.agregarCliente(Cesar);
        bcp.agregarCliente(Miguel);
        bcp.agregarCliente(Paul);
        System.out.println("2) Eliminando cliente: ");
        bcp.darBajaCliente(Miguel);
        System.out.println("   Agregando nuevo cliente:");
        bcp.agregarCliente(Paul);
        //listar clientes
        System.out.println("3) Lista de clientes: ");
        System.out.println(bcp.toString());
        //Buscar clientes
        System.out.println("4) Busqueda de clientes: ");
        bcp.buscarCliente(Cesar);
        bcp.buscarCliente(Miguel);
    }
}
