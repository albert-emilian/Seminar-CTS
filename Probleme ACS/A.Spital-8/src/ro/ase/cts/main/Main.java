package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.FrunzaSectie;
import ro.ase.cts.clase.Subdepartament;

public class Main {
    public static void main(String[] args) throws Exception {

        FrunzaSectie departament = new Departament();

        FrunzaSectie subdepartament = new Subdepartament("Pediatrie");
        FrunzaSectie subdepartament1 = new Subdepartament("Orologie");
        FrunzaSectie subdepartament2 = new Subdepartament("Oncologie");
        FrunzaSectie subdepartament3 = new Subdepartament("Neurologie");

        departament.adaugaNod(subdepartament);
        departament.adaugaNod(subdepartament1);
        departament.adaugaNod(subdepartament2);
        departament.adaugaNod(subdepartament3);

        departament.afiseazaSubdepartamente();

        departament.stergeNod(subdepartament);

        departament.afiseazaSubdepartamente();


    }
}
