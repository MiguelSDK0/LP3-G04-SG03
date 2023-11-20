/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Integer: " + 4 + " y " + 5 + " es: " + isEqualsTo(4,5));
        System.out.println("Double: " + 4.5 + " y " + 4.5 + " es: " + isEqualsTo(4.5,4.5));
        System.out.println("String: " + "a" + " y " + "b" + " es: " + isEqualsTo("a","b"));
        System.out.println("Integer: " + 4 + " y " + 5 + " es: " + isEqualsTo(4,5));
        Persona p1 = new Persona(12345678, "Miguel", "Casa1");
        Persona p2 = new Persona(91011121, "Cesar", "Casa2");
        Persona p3 = new Persona(12345678, "Miguel", "Casa1");
        System.out.println("Objetos: " + p1 + " y " + p2 + " es: " + isEqualsTo(p1, p3));
    }
    
    public static <t> boolean isEqualsTo(t x, t y){
        if(x.equals(y)){
            return true;
        }
        return false;
    }
}
