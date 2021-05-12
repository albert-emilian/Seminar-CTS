package ro.ase.cts.main;

import ro.ase.cts.clase.Pacient;

public class Main {
    public static void main(String[] args){

        Pacient pacient = new Pacient("Gheorghe");

        System.out.println(pacient);

        pacient.punePacientSubObservatie();
        pacient.externeazaPacient();



    }
}
