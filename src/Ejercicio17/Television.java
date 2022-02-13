package Ejercicio17;

public class Television extends Electrodomestico {
    //Constantes
    // Resolucion tv por defecto
    private final static int resolucionXDefecto =20;

    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;

    //Métodos publicos

    //retorna el precio final de tv
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }

        return plus;
    }

    //Constructor

    public Television(){
        this(precioBaseDefecto, pesoDefecto, consumoEnerDefecto, colorDefecto, resolucionXDefecto, false);
    }

    public Television(double precioBase, double peso){
        this(precioBase, peso, consumoEnerDefecto, colorDefecto, resolucionXDefecto, false);
    }


    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}

