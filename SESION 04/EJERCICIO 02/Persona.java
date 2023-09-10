/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacioncrediticia;

import java.util.Random;

/**
 *
 * @author User
 */
public class Persona {
    private int sexo;
    private int trabaja;
    private int sueldo;

    public Persona() {
        Random random = new Random();
        sexo = random.nextInt(2) + 1;
        trabaja = random.nextInt(2) + 1;
        int sueldo = 0;
        if (trabaja == 1) {
            this.sueldo = random.nextInt(2051) + 950;
        }
    }

    public int getSexo() {
        return sexo;
    }

    public int getTrabaja() {
        return trabaja;
    }

    public int getSueldo() {
        return sueldo;
    }
}
