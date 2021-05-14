package ro.ase.cts.main;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentFactory;
import ro.ase.cts.clase.TipMedicament;

public class Main {
    public static void main(String[] args){

        Medicament medicament = new MedicamentFactory().getMedicament(TipMedicament.Body,"Paracetamol",25);
        System.out.println(medicament);

    }
}
