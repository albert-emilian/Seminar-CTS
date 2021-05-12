package ro.ase.cts.main;

import ro.ase.cts.clase.ISectie;
import ro.ase.cts.clase.Sectiune;
import ro.ase.cts.clase.Subsectie;

public class Main {
    public static void main(String[] args) throws Exception {


        ISectie subsectie1 = new Subsectie("cafea");
        ISectie subsectie2 = new Subsectie("sucuri");
        ISectie subsectie3 = new Subsectie("freshuri");

        ISectie sectie = new Sectiune("bauturi");

        sectie.adaugaNod(subsectie1);
        sectie.adaugaNod(subsectie2);
        sectie.adaugaNod(subsectie3);

        System.out.println(sectie);


    }
}
