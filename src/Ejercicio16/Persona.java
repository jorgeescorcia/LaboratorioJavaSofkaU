package Ejercicio16;

public class Persona {

    //Atributos

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso =0;
    private double altura;
    //Constantes

    private final static char sexoXDefecto = 'H';
    public static final int pesoInferior = -1;
    public static final int pesoIdeal = 0;


     //El peso de la persona esta por encima del peso ideal

    public static final int sobrePeso= 1;


    public Persona() {
        this("", 0, sexoXDefecto, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
        generarDni();
    }
    private void comprobarSexo(){
        if(sexo != 'H' && sexo != 'M'){
            this.sexo = sexoXDefecto;
        }

    }

    private void generarDni(){
        final int div = 23;

        int numeroDNI = ((int)Math.floor(Math.random()*(100000000-10000000)+10000000));
        int resp= numeroDNI -(numeroDNI/div*div);

        //calculamos la letra que lleva en DNI
        char letraDNI = genLetraDNI(resp);

        //convertimos el dni  a string
        DNI = Integer.toString(numeroDNI)+letraDNI;

    }

    private char genLetraDNI(int resp) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resp];
    }
    //Metodo para cambiar el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo para cambiar edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIndiceMasaCorporal() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return pesoInferior;
        } else {
            return sobrePeso;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "INFORMACION DE LA PERSONA:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}



