/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author user
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try{
            System.out.println(metodo("w"));
        }catch(Exception e){
            System.out.println("Excepcion de metodo()");
            e.printStackTrace();
        }
    }
    private static int metodo(String num){
        int valor = 0;
        try{
            valor++;
            valor += Integer.parseInt(num);
            valor++;
            System.out.println("Valor al final de try " + valor);
        }catch(NumberFormatException e){
            valor += Integer.parseInt("42");
            System.out.println("Valor al final de catch " + valor);
            throw e;
        }
        finally{
            valor ++;
            System.out.println("Valor al final de finally " + valor);
        }
        valor++;
        System.out.println("Valor antes del return " + valor);
        return valor;
    }
}