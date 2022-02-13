package Ejercicio3;

import java.util.Scanner;



public class AreaDeUnCirculo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float radio;
        double area;


        System.out.println("Ingresa el radio del circulo");
        radio = leer.nextFloat();

        area = Math.PI * Math.pow(radio,2);
        System.out.println("El area es: "+area);

    }
}
