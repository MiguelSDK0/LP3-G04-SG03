/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        CandyBags bag = new CandyBags();
        Goodies g1 = new Goodies("Soda V", 0.80);
        Goodies g2 = new Goodies("Caramelo", 0.20);
        Goodies g3 = new Goodies("Glacita", 1.0);
        Goodies g4 = new Goodies("Menta",1.3);
        Goodies g5 = new Goodies("Casino",2.2);
        bag.add(g1);
        bag.add(g2);
        bag.add(g3);
        bag.add(g4);  
        bag.add(g5);
        System.out.println("Golosina mas barata: " + bag.cheapest().getNombre());
        Goodies[] mostExpensiveGoodies = bag.mostExpensive(3);
        System.out.println("Golosinas mas caras: ");
        for (Goodies goodie : mostExpensiveGoodies) {
            System.out.println("=> " + goodie.getNombre() + " " + goodie.getPrecio());           
        }
    }
}
