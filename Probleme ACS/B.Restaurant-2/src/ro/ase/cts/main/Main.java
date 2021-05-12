package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args){

        Rezervare rezervare = new RezervareBuilder()
                .setDecoreareMasa(true)
                .setGenMuzica(true)
                .setMuzicaAmbientala(true)
                .build();

        System.out.println(rezervare);

    }
}
