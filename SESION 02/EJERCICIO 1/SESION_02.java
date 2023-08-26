/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SESION_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidad;
        int opc;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del titular: ");
        String titular = entrada.next();
        
        System.out.println("¿Desea ingresar una cantidad inicial?");
        String op = entrada.next();
        
        CuentaBanco cuenta;
        if ("S".equals(op)) {
            System.out.println("Ingrese la cantidad: ");
            cantidad = entrada.nextDouble();
            cuenta = new CuentaBanco(titular, cantidad);
        } else {
            cuenta = new CuentaBanco(titular);
        }
        System.out.println("Cuenta creada");
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar dinero");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la cantidad: ");
                    cantidad = entrada.nextDouble();
                    cuenta.ingresar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    cantidad = entrada.nextDouble();
                    cuenta.retirar(cantidad);
                    break;
                case 3:
                    System.out.println("Informacion de la cuenta: ");
                    System.out.println(cuenta.toString());
                    break;
            }
        } while (opc != 4);
    }
    
}
