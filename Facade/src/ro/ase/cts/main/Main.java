package ro.ase.cts.main;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Persoana;

public class Main {

    public static void main(String[] args){

        Persoana persoana = new Persoana("Alex", "1942377146882");

        System.out.println(Facade.esteEligibil(persoana) ? "Oferim credit" : "Nu oferim credit");

    }
}
