package ro.ase.cts.main;

import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Subsectie;

public class Main {
    public static void main(String[] args) throws Exception {


        Subsectie subsectie = new Subsectie("Adulti");
        Subsectie subsectie1 = new Subsectie("Copii");
        Subsectie subsectie2 = new Subsectie("Adolescenti");

        Sectie sectie = new Sectie("Raceala");

        sectie.addSectie(subsectie);
        sectie.addSectie(subsectie1);
        sectie.addSectie(subsectie2);

        sectie.afiseazaSubsectii();

    }
}
