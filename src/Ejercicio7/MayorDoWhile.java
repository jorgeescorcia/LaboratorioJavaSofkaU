package Ejercicio7;

import java.util.Scanner;

public class MayorDoWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
    do {
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();


    } while(numero <0 );
        System.out.println("el numero "+numero+" es mayor o igual a 0");
    }
}
