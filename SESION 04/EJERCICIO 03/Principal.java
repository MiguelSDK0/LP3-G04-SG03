/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_04_ejercicio_3;

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
        double[][] ventas = new double[5][4];
        for(int i = 0; i < 4; i++){
            System.out.println("VENDEDOR " + (i+1));
            for(int j = 0; j < 5; j++){
                System.out.println("INGRESE EL VALOR DEL PRODUCTO " + (j+1) + ": ");
                ventas[j][i] = entrada.nextDouble();
            }
        }
        double[] totalProducto = new double[5];
        double[] totalVendedor = new double[4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalProducto[i] += ventas[i][j];
                totalVendedor[j] += ventas[i][j];
            }
        }
        System.out.println("\t\tPRODUCTO 1\tPRODUCTO 2\tPRODUCTO 3\tPRODUCTO 4\tPRODUCTO 5\tTOTAL");
        for (int i = 0; i < 4; i++) {
            System.out.print("VENDEDOR " + (i+1) + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(ventas[j][i] + "\t\t");
            }
            System.out.println(totalVendedor[i]);
        }
        System.out.print("TOTAL\t\t");
        for (int i = 0; i < 5; i++) {
            System.out.print(totalProducto[i] + "\t\t");
        }
        System.out.println();        
    }
}
