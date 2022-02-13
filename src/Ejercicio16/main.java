package Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        System.out.println("Digita el nombre");
        String nombre = leer.next();

        System.out.println("Digita la edad");
        int edad = leer.nextInt();

        System.out.println("Digita el sexo");
        char sexo = leer.next().charAt(0);

        System.out.println("Digita el peso");
        double peso = leer.nextDouble();

        System.out.println("Digita la altura");
        double altura = leer.nextDouble();

        //Creando los objetos

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        persona1.setNombre("Jorge Andres Escoria");
        persona1.setEdad(29);
        persona1.setSexo('H');
        persona1.setPeso(52);
        persona1.setAltura(1.63);
        //insertamos los datos que faltan en persona2
        persona2.setPeso(58);
        persona2.setAltura(1.65);

        System.out.println("Persona1");
        MostrarMensajePeso(persona1);
        MostrarMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MostrarMensajePeso(persona2);
        MostrarMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MostrarMensajePeso(persona3);
        MostrarMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
        public static void MostrarMensajePeso(Persona p) {
            int IMC = p.calcularIndiceMasaCorporal();
            switch (IMC) {
                case Persona.pesoIdeal:
                    System.out.println("La persona esta en su peso ideal");
                    break;
                case Persona.pesoInferior:
                    System.out.println("La persona esta por debajo de su peso ideal");
                    break;
                case Persona.sobrePeso:
                    System.out.println("La persona esta por encima de su peso ideal");
                    break;
            }
        }
    public static void MostrarMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }


    }


}


