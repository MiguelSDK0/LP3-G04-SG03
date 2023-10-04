/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_05_Actividades;

/**
 *
 * @author user
 */
public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("MGL-542", 4, "Toyota", "4x4");
        Motor m1 = new Motor(50, 200);
        a1.setMotor(m1);
        System.out.println(a1.toString());
        System.out.println(m1.toString());
    }
}
