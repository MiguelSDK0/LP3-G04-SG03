/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTVIDADES;

/**
 *
 * @author Cesar
 */
public class App2 {
    public static void main(String[] args) {
        System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n",3, 4, 5, 6, minimo(3,4,5, 6));
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",3.5, 4.3, 5.2, 6.3, minimo(3.5,2.3,5.2, 6.3));
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n","hola", "como", "te", "encuentras", minimo("hola", "como", "te", "encuentras"));
        Persona p1 = new Persona(12345678, "Miguel", "Casa1");
        Persona p2 = new Persona(91011121, "Cesar", "Casa2");
        Persona p3 = new Persona(31415161, "Adriana", "Casa3");
        Persona p4 = new Persona(71819202, "Martha", "Casa4"); 
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",p1.getNombre(), p2.getNombre(), p3.getNombre(), p4.getNombre(), minimo(p1, p2, p3, p4));
    }
    public static <t extends Comparable<t>> t minimo(t a, t b, t c, t d){
        t min = a;
        if(b.compareTo(a) < 0)
            min = b;
        if(c.compareTo(b) < 0)
            min = c;
        if(d.compareTo(c) < 0)
            min = d;
        return min;
    }
}