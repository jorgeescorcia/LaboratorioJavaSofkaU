package Ejercicio17;

public class Main {
    public static void main(String[] args) {

        //Creando el array de electrodomesticos
        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

        //Asignamos las posiciones
        listaElectrodomesticos[0] = new Electrodomestico(100, 42, 'E', "negro");
        listaElectrodomesticos[1] = new Lavadora(130, 35);
        listaElectrodomesticos[2] = new Television(480, 70, 'A', "verde", 42, false);
        listaElectrodomesticos[3] = new Electrodomestico();
        listaElectrodomesticos[4] = new Electrodomestico(780, 14, 'C', "blanco");
        listaElectrodomesticos[5] = new Lavadora(320, 45, 'D', "gris", 45);
        listaElectrodomesticos[6] = new Television(190, 90);
        listaElectrodomesticos[7] = new Lavadora(350, 90, 'C', "verde", 20);
        listaElectrodomesticos[8] = new Television(250, 50, 'Z', "naranja", 45, true);
        listaElectrodomesticos[9] = new Electrodomestico(90, 20);

        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;

        //Recorremos el array invocando el metodo precioFinal
        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
        }

        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones);

    }
}
