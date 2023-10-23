/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.println("Introduzca un dividendo entero: ");
                int numerador = entrada.nextInt();
                System.out.println("Introduzca un divisor entero: ");
                int denominador = entrada.nextInt();
                int resultado = numerador / denominador;
                System.out.println("Resultado: " + numerador + "/" + denominador + " = " + resultado);
                flag = false;
            } catch (InputMismatchException | ArithmeticException e){
                System.out.println("Se activo una excepcion: " + e);
                System.out.println("Ingrese un numero entero...");
                entrada.nextLine();
            }
        } while (flag);
    }
}
