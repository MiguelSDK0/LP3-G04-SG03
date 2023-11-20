/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio2 {
    public static void main(String[] args) throws Limite{
        String[] stringArreglo = {"a", "b", "c", "d", "e", "f"};
        Integer[] intArreglo = {1, 2, 3, 4, 5, 6, 7, 8};
        intercambio(stringArreglo, 0, 2);
        intercambio(intArreglo, 2, 6);
    }
    
    public static <t> void intercambio(t[] inputArray, int x, int y) throws Limite{
        t p1, p2;
        if(x < 0 || y >= inputArray.length || x > y || x == y){
            throw new Limite ("Posiciones invalidas");
        }
        p1 = inputArray[x];
        p2 = inputArray[y];
        inputArray[x] = p2;
        inputArray[y] = p1;
        System.out.println("Arreglo nuevo: ");
        for(t elemento : inputArray){
            System.out.printf("%s ", elemento);
        }
        System.out.println("");
    }
}