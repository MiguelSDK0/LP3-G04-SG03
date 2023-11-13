/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daryo
 */
public class BInarios2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        double[][] matriz;
        int filas, columnas, i, j;
        do{
            System.out.print("Numero de filas: ");
            filas = entrada.nextInt();
        }while(filas <= 0);
        do{
            System.out.print("Numero de columnas: ");
            columnas = entrada.nextInt();
        }while(columnas <= 0);
        
        matriz = new double[filas][columnas];
        
        for(i = 0; i < filas; i++){
            for(j = 0; j < columnas; j++){
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
        try{
            fos = new FileOutputStream("d:/ficheros/matriz.dat");
            salida = new DataOutputStream(fos);
            
            salida.writeInt(filas);
            salida.writeInt(columnas);
            
            salida.writeInt(filas);
            salida.writeInt(columnas);
            
            for(i = 0; i < filas; i++){
                for(j = 0; j < columnas; j++){
                    salida.writeDouble(matriz[i][j]);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fos != null){
                    fos.close();
                }
                if(salida != null){
                    salida.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
