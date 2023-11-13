/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author daryo
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        try(PrintWriter salida = new PrintWriter("d:/ficheros/datos.txt")){
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = entrada.nextLine();
            while(!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena = entrada.nextLine();
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
