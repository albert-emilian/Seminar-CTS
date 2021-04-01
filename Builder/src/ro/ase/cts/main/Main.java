package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Main {

    public static void main(String[] args){

        Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(1)
                                                    .setAreMancare(true)
                                                    .setAreMuzica(true)
                                                    .setGenMuzica("Rock")
                                                    .setAreScaunErgonomic(true)
                                                    .build();

        Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(1)
                .setAreMancare(true)
                .setAreMuzica(false)
                .setGenMuzica("Pop")
                .setAreScaunErgonomic(false)
                .build();

       // System.out.println(rezervare1);
       // System.out.println(rezervare2);

        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreMuzicaAmbientala(true);
        Rezervare rezervare3 = rezervareBuilderV2.setCodRezervare(104).build();
        Rezervare rezervare4 = rezervareBuilderV2.setCodRezervare(105).build();

        System.out.println(rezervare3);
        System.out.println(rezervare4);





    }

}
