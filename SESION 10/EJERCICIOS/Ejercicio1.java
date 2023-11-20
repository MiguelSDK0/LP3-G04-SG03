/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Float[] floatArray = {1.5f, 5.1f, 6f};
        Boolean[] booleanArray = {true, false, true};
        Persona[] personaArray = new Persona[3];
        personaArray[0] = new Persona(12345678, "Miguel", "Casa1");
        personaArray[1] = new Persona(91011121, "Cesar", "Casa2");
        personaArray[2] = new Persona(31415161, "Adriana", "Casa3");
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        System.out.printf("Array floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("Array boobleanArray contiene:%n");
        imprimirArray(booleanArray);
        System.out.printf("Array personaArray contiene:%n");
        imprimirArray(personaArray);
        System.out.printf("Array stringArray contiene:%n");
        imprimirArray(stringArray);
    }
    public static <t> void imprimirArray(t[] inputArray){
        for(t elemento : inputArray){
            System.out.printf("%s ", elemento.toString());
        }
        System.out.println("");
    }
    
    public static void imprimirArray(String[] inputArray){
        int cont = 1;
        for (String j : inputArray){
            if (cont == 4){
                System.out.printf("%n");
                cont = 1;
            }
            else {
                System.out.printf("%-8s",j);
                cont++;
            }
        }
    }
}
