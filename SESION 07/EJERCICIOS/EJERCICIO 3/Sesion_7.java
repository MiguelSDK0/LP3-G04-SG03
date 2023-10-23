/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_7;
import java.io.IOException;
/**
 *
 * @author User
 */
public class Sesion_7 {
    private LeerEntrada lector;

    public Sesion_7(LeerEntrada lector) {
        this.lector = lector;
    }

    public void procesar() {
        try {
            char caracter = lector.getChar();

            if (caracter == 'S' || caracter == 's') {
                throw new ExcepcionSalida("Saliendo del programa");
            } else if (caracter == ' ') {
                System.out.println("Espacio en blanco ingresado");
            } else if (Character.isDigit(caracter)) {
                throw new ExcepcionNumero("Se ingreso un numero");
            } else if (Character.isLetter(caracter)) {
                if ("aeiouAEIOU".indexOf(caracter) != -1) {
                    throw new ExcepcionVocal("Se ingreso una vocal");
                }
                System.out.println("Se ingreso una letra");
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (ExcepcionVocal | ExcepcionNumero e) {
            System.out.println(e.getMessage());
        } catch (ExcepcionSalida e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);
        Sesion_7 programa = new Sesion_7(lector);
        while (true) {
            programa.procesar();
        }
    }
}
