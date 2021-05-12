package ro.ase.cts.clase;

public class Facade {
    public static void esteMasaPregatita(Masa masa){
        if(Curatare.debarasareMasa(masa) && MasaLibera.esteMasLibera(masa) && Servetele.verificaServeteleNoi(masa)){
            System.out.println("Masa este pregatita");
        }else{
            System.out.println("Masa nu este libera");
        }
    }
}
