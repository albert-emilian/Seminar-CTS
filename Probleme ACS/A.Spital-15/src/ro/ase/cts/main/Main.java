package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args){

        Operator operator = new Operator();

        Comanda comanda = new ComandaInternare(operator);
        Comanda comanda1 = new ComandaTratatre(operator);
        Comanda comanda2 = new ComandaInternare(operator);


        Spital spital = new Spital();
        spital.adaugaComanda(comanda);
        spital.adaugaComanda(comanda1);
        spital.adaugaComanda(comanda2);

        spital.executaComanda();
        spital.executaComanda();
        spital.executaComanda();

    }
}
