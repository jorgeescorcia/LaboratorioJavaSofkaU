package Ejercicio11;

import java.util.Scanner;

public class LongitudFrase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int contador=0;

        System.out.println("Ingresa una frase: ");
        frase = leer.nextLine();

        System.out.println("la longitud de la frase es: "+frase.length() +" caracteres");

        for (int i = 0; i <frase.length() ; i++) {
            if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                contador++;
            }

        }
        System.out.println("Y contiene: "+ contador+" vocales");
    }
}
