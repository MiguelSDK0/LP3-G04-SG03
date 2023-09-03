/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
        Coordenada CR1 =  new Coordenada(0,3);
        Coordenada CR2 =  new Coordenada(5,0);
        Rectangulo R1 = new Rectangulo(CR1, CR2);
        R1.InicializarColor();
        System.out.println("Coordenadas: ");
        R1.mostrarCoordenadas();
        System.out.println("El area del rectangulo es: "+ Manejador.calcularArea(R1));
        System.out.println("El perimetro del rectangulo es: "+ Manejador.calcularPerimetro(R1));
        Manejador.moverX(R1, 5);
        Manejador.moverY(R1, 3);
        System.out.println("-------------------------");
        System.out.println("Coordenadas actualizadas: ");
        R1.mostrarCoordenadas();
        System.out.println("El area del rectangulo actualizado es: "+ Manejador.calcularArea(R1));
        System.out.println("El perimetro del rectangulo actualizado es: "+ Manejador.calcularPerimetro(R1));
        System.out.println("-------------------------");
        Coordenada CR3 =  new Coordenada(0,2);
        Coordenada CR4 =  new Coordenada(8,0);
        Rectangulo R2 = new Rectangulo(CR1, CR2);
        Coordenada CR5 =  new Coordenada(0,3);
        Coordenada CR6 =  new Coordenada(5,0);
        Rectangulo R3 = new Rectangulo(CR1, CR2);
        Coordenada CR7 =  new Coordenada(0,3);
        Coordenada CR8 =  new Coordenada(5,0);
        Rectangulo R4 = new Rectangulo(CR1, CR2);
        System.out.println(R1.color());
        System.out.println(R2.color());
        System.out.println(R3.color());
        System.out.println(R4.color());
        R1.color();
    }
}
