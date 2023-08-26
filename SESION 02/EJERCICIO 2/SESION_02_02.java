/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_02_02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SESION_02_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese primer nombre: ");
        String nombre = entrada.next();
        
        System.out.println("Ingrese apellido: ");
        String apellido = entrada.next();

        System.out.println("Ingrese el sexo: ");
        String sexo = entrada.next();

        System.out.println("Ingrese dia de nacimiento: ");
        int dia = entrada.nextInt();
        
         System.out.println("Ingrese mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.println("Ingrese anio de nacimiento: ");
        int anio = entrada.nextInt();

        System.out.println("Ingrese altura (en cm): ");
        double altura = entrada.nextDouble();

        System.out.println("Ingrese peso (en kg): ");
        double peso = entrada.nextDouble();
        
        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        
        System.out.println(perfil.toString());
        
        int edad = perfil.calcularEdad(anio);
        
        System.out.println("La edad del paciente es: " + edad);
        
        double fmc = perfil.calcularFMC(edad);
        
        System.out.println("El FMC del paciente es: " + fmc);
        
        double imc = perfil.calcularIMD(peso, altura);
        
        System.out.println("El IMC del paciente es: " + imc);
    }
    
}
