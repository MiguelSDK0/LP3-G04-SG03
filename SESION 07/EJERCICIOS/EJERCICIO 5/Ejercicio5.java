/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        assert Edad(edad) : "Su edad es " + edad + ", usted es menor de edad";
        System.out.println("Usted cumple con ser mayor de edad");
    }

    public static boolean Edad(int edad) {
        return edad >= 18;
    }
}

