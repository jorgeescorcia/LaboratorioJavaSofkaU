package Ejercicio4;

import java.util.Scanner;

public class CalcularIva {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final double iva;
        double numero;


        System.out.println("Ingrese el precio del producto");
        numero = leer.nextDouble();

        iva = numero *0.21;
        numero = numero+iva;

        System.out.println("El precio sin IVA es: ");
        System.out.println("El precio final es: "+(numero));



    }
}
