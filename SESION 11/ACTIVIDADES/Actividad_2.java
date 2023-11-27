/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */
public class Actividad_2 {
    public static void main(String[] args) {
        
        OrderedPair<Integer, Integer> pr1 = new OrderedPair<>(2, 1);
        System.out.println("Par 1: " + pr1);
        
        OrderedPair<Integer, String> pr2 = new OrderedPair<>(3, "Hola");
        System.out.println("Par 2: " + pr2);

        Persona_2 p1 = new Persona_2("Cesar", 19); 
        OrderedPair<String, Persona_2> pr3 = new OrderedPair<>("2023", p1);
        System.out.println("Par 3: " + pr3);
    }
}
