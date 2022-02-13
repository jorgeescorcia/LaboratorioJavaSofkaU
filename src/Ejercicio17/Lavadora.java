package Ejercicio17;

public class Lavadora extends Electrodomestico {
    //Constantes
    private final static int cargaDefecto = 5;

    //Atributos
    private int carga;

    //Métodos publicos
    public int getCarga() {
        return carga;
    }

    //precio final de la lavadora
    public double precioFinal() {
        //Invocamos el método precioFinal del método padre
        double plus = super.precioFinal();


        if (carga > 30) {
            plus += 50;
        }

        return plus;
    }

    //Constructor
    public Lavadora() {
        this(precioBaseDefecto, pesoDefecto, consumoEnerDefecto, colorDefecto, cargaDefecto);
    }


    public Lavadora(double precioBase, double peso) {
        this(precioBase, peso, consumoEnerDefecto, colorDefecto, cargaDefecto);
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }
}