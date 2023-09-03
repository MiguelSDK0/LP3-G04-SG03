/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author User
 */
public class Manejador {
    public static double calcularArea(Rectangulo rectangulo) {
        double base = Math.abs(rectangulo.getEsquina2().getX() - rectangulo.getEsquina1().getX());
        double altura = Math.abs(rectangulo.getEsquina2().getY() - rectangulo.getEsquina1().getY());
        return base * altura;
    }
    public static double calcularPerimetro(Rectangulo rectangulo) {
        double base = Math.abs(rectangulo.getEsquina2().getX() - rectangulo.getEsquina1().getX());
        double altura = Math.abs(rectangulo.getEsquina2().getY() - rectangulo.getEsquina1().getY());
        return 2 * (base + altura);
    }
    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada nuvEsquina2 = new Coordenada(rectangulo.getEsquina2().getX() + puntos, rectangulo.getEsquina2().getY());
        Coordenada nuvEsquina1 = new Coordenada(rectangulo.getEsquina1().getX() + puntos, rectangulo.getEsquina1().getY());

        rectangulo.setEsquina2(nuvEsquina2);
        rectangulo.setEsquina1(nuvEsquina1);
    }
    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada nuvEsquina2 = new Coordenada(rectangulo.getEsquina2().getX(), rectangulo.getEsquina2().getY() + puntos);
        Coordenada nuvEsquina1 = new Coordenada(rectangulo.getEsquina1().getX(), rectangulo.getEsquina1().getY() + puntos);

        rectangulo.setEsquina2(nuvEsquina2);
        rectangulo.setEsquina1(nuvEsquina1);
    }
}
