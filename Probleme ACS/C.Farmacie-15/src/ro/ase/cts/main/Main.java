package ro.ase.cts.main;

import ro.ase.cts.clase.AjutorFarmacist;
import ro.ase.cts.clase.Comanda;
import ro.ase.cts.clase.ComandaTrimiteDepozit;
import ro.ase.cts.clase.Medicament;

public class Main {
    public static void main(String[] args){


        Medicament medicament = new Medicament("Paracetamol", 30);
        Medicament medicament1 = new Medicament("Algocalmin", 30);
        Medicament medicament2 = new Medicament("Nurofen", 30);
        Comanda comandaTrimitereDepozit = new ComandaTrimiteDepozit(medicament);
        Comanda comandaTrimitereDepozit1 = new ComandaTrimiteDepozit(medicament1);
        Comanda comandaTrimitereDepozit2 = new ComandaTrimiteDepozit(medicament2);

        AjutorFarmacist ajutorFarmacist = new AjutorFarmacist();
        ajutorFarmacist.preiaComanda(comandaTrimitereDepozit);
        ajutorFarmacist.preiaComanda(comandaTrimitereDepozit1);
        ajutorFarmacist.preiaComanda(comandaTrimitereDepozit2);

        ajutorFarmacist.executaComanda();
        ajutorFarmacist.executaComanda();
        ajutorFarmacist.executaComanda();




    }
}
