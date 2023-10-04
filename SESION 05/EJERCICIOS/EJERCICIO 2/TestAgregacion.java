/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TestAgregacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Automovil> automoviles = new ArrayList<>();

        while (true) {
            System.out.println("--------MENU-------");
            System.out.println("1. Crear automovil");
            System.out.println("2. Mostrar automoviles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa del automovil: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese el numero de puertas: ");
                    int numPuertas = scanner.nextInt();
                    System.out.print("Ingrese la marca del automovil: ");
                    String marca = scanner.next();
                    System.out.print("Ingrese el modelo del automovil: ");
                    String modelo = scanner.next();
                    
                    Automovil automovil;
                    System.out.println("desea que el automovil tenga un motor(Si/No)");
                    String respuesta = scanner.next().toLowerCase();
                    if (respuesta.equals("si")) {
                        System.out.print("Ingrese el numero del motor: ");
                        int numMotor = scanner.nextInt();
                        System.out.print("Ingrese las revoluciones por minuto del motor: ");
                        int revPorMin = scanner.nextInt();
                        Motor motor = new Motor(numMotor, revPorMin);
                        automovil = new Automovil(placa, numPuertas, marca, modelo);
                        automovil.setMotor(motor);
                    } else {
                        automovil = new Automovil(placa, numPuertas, marca, modelo);
                    }
                    
                    automoviles.add(automovil);
                    System.out.println("Automovil creado");
                    break;

                case 2:
                    if (automoviles.isEmpty()) {
                        System.out.println("No hay ningun automovil");
                    } else {
                        System.out.println("----Automoviles----");
                        for (Automovil a : automoviles) {
                            System.out.println(a.toString());
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }
}
