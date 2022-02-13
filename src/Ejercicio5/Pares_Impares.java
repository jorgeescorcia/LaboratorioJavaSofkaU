package Ejercicio5;

public class Pares_Impares {
    public static void main(String[] args) {
        int numero =1;

        while(numero <=100){
            if(numero%2 ==0){
                System.out.println("Par: "+numero);
            }else{
                System.out.println("Impar: "+numero);
            }
            numero ++;
        }
    }
}
