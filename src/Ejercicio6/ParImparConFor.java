package Ejercicio6;

public class ParImparConFor {
    public static void main(String[] args) {
        for (int i =1; i<=100; i++){
            if(i%2==0){
                System.out.println("Par: "+i);
            }else{
                System.out.println("Impar: "+i);
            }
        }
    }
}
