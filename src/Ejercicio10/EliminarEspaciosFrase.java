package Ejercicio10;

import java.util.Scanner;

public class EliminarEspaciosFrase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase;
        String fraseSinEspacios;
        System.out.println("ingrese una frase: ");
        frase =leer.nextLine();

        fraseSinEspacios = frase.replace(" ","");
        System.out.println(fraseSinEspacios);



    }
}
