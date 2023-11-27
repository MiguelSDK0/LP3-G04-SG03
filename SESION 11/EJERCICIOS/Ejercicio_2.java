/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio_2 {
    public static void main(String[] args) throws ObjectNoExist {
        try {
            Dictionary dict1 = new Dictionary();
            dict1.add(1, "Paolo");
            dict1.add(2, "Cesar");
            dict1.add(3, "Miguel");
            System.out.println(dict1);
            System.out.println("=> Eliminar key 2: ");
            System.out.println(dict1.delete(2));
            System.out.println(dict1);
            System.out.println("=> Obtener Valor de Key 3: ");
            System.out.println(dict1.getValue(3).toString());
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}
