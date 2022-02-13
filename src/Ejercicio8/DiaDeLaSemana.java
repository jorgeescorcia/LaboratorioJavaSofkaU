package Ejercicio8;

import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dia;
        System.out.println("Ingresa el dia se la semana: ");
        dia = leer.next();

        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Dia no laboral");
                break;
        }
    }
}
