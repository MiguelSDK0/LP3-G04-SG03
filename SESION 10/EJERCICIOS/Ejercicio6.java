/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cesar
 */

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] arrayString1 = {"UNO", "DOS", "TRES"};
        String[] arrayString2 = {"UNO", "DOS", "CUATRO"};
        String[] arrayStringCombinado = copyArray(arrayString1, arrayString2);
        System.out.println("Array de string combinado");
        MostrarArray(arrayStringCombinado);
        System.out.println("");

        Producto2[] arrayProdcuto1 = {new Producto2("Leche"), new Producto2("Fideos")};
        Producto2[] arrayProdcuto2 = {new Producto2("Leche"), new Producto2("Azucar")};
        Producto2[] arrayProductoCombinado = copyArray(arrayProdcuto1, arrayProdcuto2);
        System.out.println("Array de producto combinado: ");
        MostrarArray(arrayProductoCombinado);
        System.out.println("");

        Persona2[] arrayPersona1 = {new Persona2("Cesar", 19), new Persona2("Miguel", 50)};
        Persona2[] arrayPersona2 = {new Persona2("Cesar", 19), new Persona2("Miguel", 19)};
        Persona2[] arrayPersonaCombinado = copyArray(arrayPersona1, arrayPersona2);
        System.out.println("Array de persona combinado: ");
        MostrarArray(arrayPersonaCombinado);
    }
    public static <T> T[] copyArray(T[] array1, T[] array2) {
        Set<T> set = new HashSet<>(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));
        return set.toArray(Arrays.copyOf(array1, 0));
    }
    
    public static <T> void MostrarArray(T[] array) {
        for (T i : array) {
            System.out.println(i.toString());
        }
    }
}



