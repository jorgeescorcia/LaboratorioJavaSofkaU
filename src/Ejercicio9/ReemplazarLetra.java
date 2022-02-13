package Ejercicio9;

public class ReemplazarLetra {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseAñadir = " ,!sonrie siempre¡";
        String fraseFinal = frase.replace("a","e");
        System.out.println(fraseFinal + fraseAñadir);
        }

    }


