/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {
    
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do{
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cual es el número secreto?");
            rp = sc.nextInt();
            if(rp == 1234)
                fl = true;
        }while(vida < 3 && !fl);
        if(fl == true)
            System.out.println("Adivinaste!!!");
        else
            System.out.println("Ups, perdiste...");
    }
    
}
