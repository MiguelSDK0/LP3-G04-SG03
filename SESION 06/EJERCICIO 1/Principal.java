/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_06;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];
        figuras[0] = new Circulo(4);
        figuras[1] = new Cuadrado(8);
        figuras[2] = new Triangulo(3,6);
        figuras[3] = new Esfera(6);
        figuras[4] = new Cubo(2);
        figuras[5] = new Tetraedro(6);
        for(Figura recorrer : figuras){
            if(recorrer instanceof FiguraBidimensional){
                System.out.println("Es una Figura Bidimensional");
                System.out.println("Soy " + recorrer.getClass().getSimpleName());
                recorrer.obtenerArea();
            }
            if(recorrer instanceof FiguraTridimensional){
                System.out.println("Es una Figura Tridimensional");
                System.out.println("Soy " + recorrer.getClass().getSimpleName());
                recorrer.obtenerArea();
                ((FiguraTridimensional) recorrer).obtenerVolumen();
            }
        }
    }
}
