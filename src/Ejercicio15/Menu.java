package Ejercicio15;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while(!salir){
            System.out.println("****** GESTION CINEMATOGRÁFICA ********"+
            "\n1. NUEVO ACTOR"+
            "\n2. BUSCAR ACTOR"+
            "\n3. ELIMINAR ACTOR"+
            "\n4. MODIFICAR ACTOR"+
            "\n5. VER TODOS LOS ACTORES"+
            "\n6. VER PELICULAS DE LOS ACTORES"+
            "\n7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"+
            "\n8. SALIR");

            System.out.println("Escribe una de las opciones: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Seleccionaste la opcion 1:");
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2:");
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3:");
                    break;
                case 4:
                    System.out.println("Seleccionaste la opcion 4:");
                    break;
                case 5:
                    System.out.println("Seleccionaste la opcion 5:");
                    break;
                case 6:
                    System.out.println("Seleccionaste la opcion 6:");
                    break;
                case 7:
                    System.out.println("Seleccionaste la opcion 7:");
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    break;

            }

        }


    }

}
