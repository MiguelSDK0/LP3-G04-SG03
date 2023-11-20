/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        int posicion = buscarElemento(numeros, 3);
        System.out.println("El elemento se encuentra en la posicion: " + posicion);
    }

    public static <T extends Number> int buscarElemento(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}