package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args){

        Masa masa = new Masa(3);

        Comanda ocupare = new ComandaOcupare(masa);
        Comanda rezervare = new ComandaRezervare(masa);

        Operator operator = new Operator();
        operator.adaugaComanda(ocupare);
        operator.adaugaComanda(rezervare);

        operator.realizeazaComanda();
        operator.realizeazaComanda();

    }
}
