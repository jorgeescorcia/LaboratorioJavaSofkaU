package Ejercicio18;

public class Main {
    public static void main(String[] args) {

        //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];

        //Creamos un objeto en cada posicion del array
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("La Casa de Papel", "Netflix ");
        listaSeries[2]=new Serie("Distrito Salvaje", 2, "Accion", "Netflix");
        listaSeries[3]=new Serie("Bill Gates - Bajo la Lupa", 1 ,"Humor", "Netflix");
        listaSeries[4]=new Serie("The Walking Dead ", 10, "Accion", "AMC Networks, FOX");

        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Call Of Duty Warzone", 20, "Acción", "Activisión");
        listaVideojuegos[2]=new Videojuego("Valorant", "Riot Games");
        listaVideojuegos[3]=new Videojuego("Pes 2021", 140, "Deportes", "Konami");
        listaVideojuegos[4]=new Videojuego("Among Us", 340, "Rol", "Innersloth");

        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos

        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();

            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];

        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.mayor){
                videojuegoMayor=listaVideojuegos[i];
            }

        }

        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }

}

