/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */

public class Verificadora<T> implements Contenedorapp<T> {
    private T [] datos;
    public Verificadora(T [] x) {
          this.datos = x;
    }
    public boolean contiene (T valor) { 
          for(T ele: datos)
               if(valor.equals(ele)) 
                    return true;
          return false;
    }
} 