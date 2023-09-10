/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacioncrediticia;

/**
 *
 * @author User
 */
public class EvaluacionCrediticia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalPersonas = 8;
        int hombres = 0;
        int mujeres = 0;
        int hombresT = 0;
        int mujeresT = 0;
        int acumuladorHT = 0;
        int acumuladorMT = 0;
        
        for (int i = 0; i < totalPersonas; i++) {
            Persona persona = new Persona();
            if (persona.getSexo() == 1) {
                hombres++;
                if (persona.getTrabaja() == 1) {
                    hombresT++;
                    acumuladorHT =  acumuladorHT + persona.getSueldo();
                }
            } else {
                mujeres++;
                if (persona.getTrabaja() == 1) {
                    mujeresT++;
                    acumuladorMT = acumuladorMT + persona.getSueldo();
                }
            }
        }

        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHT = (double) hombresT / hombres * 100;
        double porcentajeMT = (double) mujeresT / mujeres * 100;
        double sueldoPromedioHT = (double) acumuladorHT / hombresT;
        double sueldoPromedioMT = (double) acumuladorMT / mujeresT;

        System.out.println("a. Porcentaje de hombres: " + porcentajeHombres);
        System.out.println("b. Porcentaje de mujeres: " + porcentajeMujeres);
        System.out.println("c. Porcentaje de hombres que trabajan: " + porcentajeHT);
        System.out.println("d. Porcentaje de mujeres que trabajan: " + porcentajeMT);
        System.out.println("e. Sueldo promedio de hombres que trabajan: " + sueldoPromedioHT);
        System.out.println("f. Sueldo promedio de mujeres que trabajan: " + sueldoPromedioMT);
    }
}
