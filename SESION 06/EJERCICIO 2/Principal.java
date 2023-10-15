/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> lista = new ArrayList<>();
        Edificio edificio = new Edificio("Categoria A", 50, 220, 6);
        Auto auto = new Auto("4x4", 50, 2, 7);
        Bicicleta bici = new Bicicleta("Montaniera", 8, 12, 3);
        lista.add(edificio);
        lista.add(auto);
        lista.add(bici);
        for (ImpactoEcologico recorrer : lista) {
            System.out.println("Objeto: " + recorrer.getClass().getSimpleName());
            if(recorrer instanceof Edificio){
                Edificio objEdificio;
                objEdificio = (Edificio) recorrer;
                System.out.println(objEdificio.getCategoria());
            }
            if(recorrer instanceof Auto){
                Auto objAuto;
                objAuto = (Auto) recorrer;
                System.out.println("Modelo "+ objAuto.getModelo());
            }
            if(recorrer instanceof Bicicleta){
                Bicicleta objEBicicleta;
                objEBicicleta = (Bicicleta) recorrer;
                System.out.println("Tipo " + objEBicicleta.getTipo());
            }
            System.out.println("El impacto ecologico es: " + recorrer.obtenerImpactoEcologico());
        }
    }
}
