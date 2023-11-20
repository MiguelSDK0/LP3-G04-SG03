/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;
/**
 *
 * @author Cesar
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Producto Pr1 = new Producto(1, "Producto1", 10.5);
        Producto Pr2 = new Producto(2, "Producto2", 20.3);
        Producto Pr3 = new Producto(3, "Producto3", 15.0);
        Producto[] productos = {Pr1, Pr2, Pr3};
        
        Persona Per1 = new Persona(111, "Alice", "Calle1");
        Persona Per2 = new Persona(222, "Bob", "Calle2");
        Persona Per3 = new Persona(333, "Charlie", "Calle3");
        Persona[] personas = {Per1, Per2, Per3};

        Estudiante Est1 = new Estudiante(444, "David", "Calle4", "Informatica");
        Estudiante Est2 = new Estudiante(555, "Eva", "Calle5", "Matematicas");
        Estudiante Est3 = new Estudiante(666, "Fernanda", "Calle6", "Fisica");
        Estudiante[] estudiantes = {Est1, Est2, Est3};

        int posPr = buscarElemento(productos, new Producto(3));
        System.out.println("Producto - Posicion: " + posPr);

        int posPer = buscarElemento(personas, new Persona("Bob"));
        System.out.println("Persona - Posicion: " + posPer);

        int posEst = buscarElemento(estudiantes, new Estudiante("Eva", "Matematicas"));
        System.out.println("Estudiante - Posicion: " + posEst);
        
    }
    public static <T> int buscarElemento(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
