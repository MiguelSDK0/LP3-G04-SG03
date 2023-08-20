package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int vida, rp, cont;
        boolean fl = false;
        vida = 0;
        cont = 2;
        Scanner sc = new Scanner(System.in);
        do{
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cual es el número secreto?");
            rp = sc.nextInt();
            if(rp == 1234)
                fl = true;
            else
                System.out.println("Te quedan " + cont + " vidas");
                cont--;
        }while(vida < 3 && !fl);
<<<<<<< HEAD
        if(fl == true)
            System.out.println("Adivinaste!!! ¡GANASTE UN INCREIBLE PREMIO!");
        else
=======
        if(fl == true){
            System.out.println("Adivinaste!!! ¡GANASTE UN INCREIBLE PREMIO!");
            String resultado = elegir(vida);
            System.out.println("Tu regalo es: " + resultado);
        }else
>>>>>>> rama2
            System.out.println("Ups, perdiste...");
    }
    public static String elegir(int vida){
        String gift = "";
        switch (vida){
            case 1:
                gift = "Un pasaje por el Caribe";
                break;
            case 2:
                gift = "Una visita al museo más cercano a tu casa";
                break;
            case 3:
                gift = "Una entrada al cine";
                break;
        }
        return gift;
    }
}
