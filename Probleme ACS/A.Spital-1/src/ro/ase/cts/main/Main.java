package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractPacientBuilder;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientBuilder;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        PacientBuilder builder = new PacientBuilder("Marius");
        Pacient pacient = builder.adaugaRabatabil(true).adaugaMicdejun(true).build();
        System.out.println(pacient);


    }
}
