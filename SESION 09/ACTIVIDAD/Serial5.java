/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author daryo
 */
public class Serial5 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        try{
            fos = new FileOutputStream("d:/ficheros/alumos.dat");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5,9,2011);
            a = new Alumno(f, "12345678A", "Lucas Gonzales", 20);
            salida.writeObject(a);
            f = new Fecha(7,9,2011);
            a = new Alumno(f, "12345678B", "Daniel Gonzales", 21);
            salida.writeObject(a);
            f = new Fecha(9,9,2011);
            a = new Alumno(f, "12345678C", "Carlos Gonzales", 22);
            salida.writeObject(a);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fos!=null) fos.close();
                if(salida != null) salida.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
