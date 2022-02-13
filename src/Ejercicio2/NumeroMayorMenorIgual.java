package Ejercicio2;

import java.util.Scanner;

public class NumeroMayorMenorIgual {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingrese el primero número: ");
        numero1 = leer.nextInt();

        System.out.println("Ingrese el segundo número: ");
        numero2 = leer.nextInt();



        if(numero1 ==numero2){
            System.out.println("Los numeros son iguales");
        }
        else if(numero1 > numero2){
            System.out.println("El número mayor es: "+ Math.max(numero1, numero2) +"\nEl número menor es: "+ Math.min(numero1,numero2));
        }else{
            System.out.println("El número mayor es: "+ Math.max(numero1, numero2) +"\nEl número menor es: "+ Math.min(numero1,numero2));
        }

    }
}
