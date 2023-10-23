/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author daryo
 */
public class App {
    public static int cociente(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        do{
            try{
                System.out.println("Introduzca un numerador entero: ");
                int numerador = entrada.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = entrada.nextInt();
                int resultado = cociente(numerador, denominador);
                System.out.println("Resultado: " + numerador + "/" + denominador + " = " + resultado);
                flag = false;
            }catch(InputMismatchException inputMismatchE){
                System.out.println("Excepcion: " + inputMismatchE);
                entrada.nextLine();
                System.out.println("Debe de introducir numeros enteros. Intente de nuevo...");
            }catch(ArithmeticException aritmeticE){
                System.out.println("Excepcion: " + aritmeticE);
                entrada.nextLine();
                System.out.println("Cero es un operador invalido. Intente de nuevo...");
            }
        }while(flag);
    }
}
