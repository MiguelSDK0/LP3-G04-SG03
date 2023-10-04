/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestComposicion {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Persona> clientes = new ArrayList<>();
        Scanner entrada = new Scanner (System.in);
        int opc = 0;
        int id;
        String nombre, apellido, cl;
        char tipo;
        do{
            System.out.println("-----MENU------");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Salir");
            System.out.println("Escoger una opcion");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el id del cliente: ");
                    id = entrada.nextInt();
                    System.out.println("Ingrese el nombre del cliente: ");
                    nombre = entrada.next();
                    System.out.println("Ingrese el apellido del cliente: ");
                    apellido = entrada.next();
                    System.out.println("Desea escoger su tipo de cliente (Si/No): ");
                    cl = entrada.next();
                    if("Si".equals(cl)){
                        do{
                            System.out.println("Ingrese un tipo de cliente: ");
                            tipo = entrada.next().charAt(0);
                        }while(tipo != 'C' && tipo != 'E' && tipo != 'B');
                        Persona nuevoCliente = new Persona(id, nombre, apellido, tipo);
                        clientes.add(nuevoCliente);
                        System.out.println("Cliente agregado con exito");
                    }else{
                        Persona nuevoCliente = new Persona(id, nombre, apellido);
                        clientes.add(nuevoCliente);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el id del cliente a depositar: ");
                    id = entrada.nextInt();
                    for(Persona recorrer : clientes){
                        if(recorrer.getId() == id){
                            System.out.println("Ingrese la cantidad a depositar: ");
                            double depositar = entrada.nextInt();
                            recorrer.getCuenta().depositar(depositar);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el id del cliente a retirar: ");
                    id = entrada.nextInt();
                    for(Persona recorrer : clientes){
                        if(recorrer.getId() == id){
                            System.out.println("Ingrese la cantidad a retirar: ");
                            double retirar = entrada.nextInt();
                            recorrer.getCuenta().retirar(retirar);
                        }
                    }
                    break;
                case 4:
                    for(Persona recorrer : clientes){
                        System.out.println(recorrer.toString());
                        System.out.println("-------------------");
                    }
                    break;
                case 5:
                    System.out.println("Cerrando sistema");
                    break;
                default:
                    break;
            }
        }while(opc != 5);
    }
}
