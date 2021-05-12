package ro.ase.cts.main;

import ro.ase.cts.clase.AdaptorMeidcament;
import ro.ase.cts.clase.IMedicamentFaraReteta;
import ro.ase.cts.clase.Medicament;

public class Main {
    public static void main(String[] args){

        Medicament medicament = new Medicament("Paracetamol",25);
        AdaptorMeidcament    adaptorMedicament = new AdaptorMeidcament(medicament);

        medicament.achizitioneazaMedicament();

        adaptorMedicament.cumparaMedicament();
    }
}
