/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_03_02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fecha fecha = new Fecha();
        fecha.leer();
        fecha.bisiesto();
        System.out.println("Dias del mes: " +fecha.diasMes());
        System.out.println("Formato corto: " + fecha.corta());
        System.out.println("Han transcurrido " + fecha.diasTranscurridos() + " dias desde 1900-01-01");
        System.out.println("El dia de la semana es: " + fecha.diaSemana());
        System.out.print("El formato largo: ");
        fecha.larga();
        System.out.println("La fecha siguiente es: " + fecha.siguiente());
        System.out.println("La fecha anterior es: " + fecha.anterior());
        System.out.println("Ingrese los dias transcurridos desde el 1-1-1900: ");
        int transcurridos = entrada.nextInt();
        System.out.println("La fecha correspondiente es: " + fecha.fechaTras(transcurridos));
        String clon = fecha.clon();
        System.out.println("Ingrese los dias a futuro para la fecha actual : ");
        int futuro = entrada.nextInt();
        String actualizada = fecha.futuro(futuro);
        System.out.println("La fecha original es: " + clon);
        System.out.println("La fecha actualizada es: " + actualizada);
        System.out.println("¿Ambas fechas son iguales? " + Fecha.igualQue(clon, actualizada));
        System.out.println("¿La Fecha1 es anterior a la Fecha2? " +Fecha.menorQue(clon, actualizada));
        System.out.println("¿La Fecha1 es posterior a la Fecha2? " +Fecha.mayorQue(clon, actualizada));
    }
    
}
