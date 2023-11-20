/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTVIDADES;

/**
 *
 * @author daryo
 */
public class App3 {
    public static void main(String[] args) throws LimiteInvalidoException {
        Float[] floatArray = {1.5f, 5.1f, 6f};
        Boolean[] booleanArray = {true, false, true};
        Persona[] personaArray = new Persona[3];
        personaArray[0] = new Persona(12345678, "Miguel", "Casa1");
        personaArray[1] = new Persona(91011121, "Cesar", "Casa2");
        personaArray[2] = new Persona(31415161, "Adriana", "Casa3");
        System.out.printf("Array floatArray contiene:%n");
        imprimirArray(floatArray, 0, 1);
        System.out.printf("Array boobleanArray contiene:%n");
        imprimirArray(booleanArray, 1, 2);
        System.out.printf("Array personaArray contiene:%n");
        imprimirArray(personaArray, 1, 2);
    }
    public static <t> void imprimirArray(t[] inputArray, int limInf, int limSup) throws LimiteInvalidoException{
        if(limInf < 0 || limSup >= inputArray.length || limInf > limSup){
            throw new LimiteInvalidoException("Limite invalido");
        }else{
            for (int i = limInf; i <= limSup; i++) {
                System.out.printf("%s ", inputArray[i].toString());
            }
            System.out.println("");
        }  
    }
}
