package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryMedicamentBody;
import ro.ase.cts.clase.IFactory;
import ro.ase.cts.clase.Medicament;

public class Main {
    public static void main(String[] args){

        IFactory factoryBody = new FactoryMedicamentBody();
        Medicament medicamentBody = factoryBody.getMedicament("Paracetamol", 30);
        System.out.println(medicamentBody);
    }
}
