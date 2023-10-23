/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author user
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso(v, 16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        if (j >= 0 && j < v.length) {
            return v[j];
        } else {
            throw new Exception("El indice " + j + " no existe en el vector");
        }
    }
}
