package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHoraActual {
    public static void main(String[] args) {
        DateTimeFormatter fechaActual = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("AAAA/MM/DD HH:MM:SS \n"+fechaActual.format(LocalDateTime.now()));
    }
}
