/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author User
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private static String Color = "rojo";
    
    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
        color();
    }
    public void InicializarColor(){
        Color = "rojo";
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }
    public void mostrarCoordenadas(){
        System.out.println("(" + esquina1.getX() + "," + esquina1.getY() +")");
        System.out.println("(" + esquina2.getX() + "," + esquina2.getY() +")");
    }
    public String color(){
        if ("verde".equals(Color)){
            Color = "amarillo"; 
        }
        else if ("amarillo".equals(Color)){
            Color = "rojo"; 
        }
        else if ("rojo".equals(Color)){
            Color = "verde"; 
        }
        return Color;
    }
}
