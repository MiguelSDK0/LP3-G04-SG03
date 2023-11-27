/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */
public class Actividad_1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Cesar","Av.ejercito","741258");
        Persona p2 = new Persona("Miguel","Av.venezuela","96358");
        Persona p3 = new Persona("Carlos");
        Persona[] arregloPersonas = {p1,p2};
        System.out.println("Persona: " + buscarElemento(arregloPersonas, p3));
        Goodies g1 = new Goodies(1,"caramelo",1.75f);
	Goodies g2 = new Goodies(2,"galleta",0.45f);
	Goodies g3 = new Goodies(3);
        Goodies[] arregloGoodies = {g1, g2};
        System.out.println("Goodies: " +buscarElemento(arregloGoodies, g3));
        Procedencia pc1 = new Procedencia("Arequipa","umacollo");
	Procedencia pc2 = new Procedencia("Tacna","Esperanza");
        Estudiante e1 = new Estudiante("Daniel","Casa 1","123","Economia",pc1);
	Estudiante e2 = new Estudiante("Carlos","Casa 2","456","Pediatria",pc2);
        Estudiante[] arregloEstudiantes = {e1,e2};
        Verificadora<Estudiante> verestudiantes = new Verificadora<Estudiante>(arregloEstudiantes);
        String msg = verestudiantes.contiene(new Estudiante("Daniel","","","",pc1))? "Si existe" : "No existe";
        System.out.println("Estudiante: " + msg);
    }
    public static <T> String buscarElemento(T[] array, T objeto) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(objeto)) {
                return "Si existe";
            }
        }
        return "No existe";
    }
}
