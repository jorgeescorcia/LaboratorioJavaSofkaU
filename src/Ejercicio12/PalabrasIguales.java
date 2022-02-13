package Ejercicio12;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra1;
        String palabra2;




        System.out.println("Digite la primera palabra: ");
        palabra1 = leer.nextLine();

        System.out.println("Digite la segunda palabra: ");
        palabra2 = leer.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Son iguales");
        }


         for (int i = 0; i < palabra1.length(); i++) {
            palabra1.charAt(i);
         }
        for (int j = 0; j < palabra2.length(); j++) {
            palabra2.charAt(j);
        }



    }
}