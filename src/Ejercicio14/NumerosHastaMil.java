package Ejercicio14;

import java.util.Scanner;

public class NumerosHastaMil {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero: ");
        numero = leer.nextInt();

        for (int i = numero; i <=1000 ; i+=2) {
            System.out.println(i);
        }

    }
}
