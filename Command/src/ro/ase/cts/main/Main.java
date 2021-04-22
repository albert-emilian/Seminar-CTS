package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {

    public static void main(String[] args){

        Masa masa = new Masa(1);
        Masa masa1 = new Masa(2);

        Comanda comandaRezervare = new ComandaRezervare(masa);
        Comanda comandaOcupare = new ComandaOcupare(masa1);
        Comanda comandaOcupare1 = new ComandaOcupare(masa1);

        Operator operator = new Operator();
        operator.invoca(comandaRezervare);
        operator.executaComanda();
        operator.invoca(comandaOcupare);
        operator.invoca(comandaOcupare1);

        operator.executaComanda();
        operator.executaComanda();

        
    }
}
