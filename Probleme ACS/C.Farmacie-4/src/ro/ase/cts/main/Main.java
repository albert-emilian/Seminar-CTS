package ro.ase.cts.main;

import ro.ase.cts.clase.Adaptor;
import ro.ase.cts.clase.Farmacie;
import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.SoftNou;

public class Main {
    public static void main(String[] args){


        Farmacie farmacie = new Farmacie();
        farmacie.adaugaMedicament(1,"Paracetamol",4);
        farmacie.adaugaMedicament(2,"Algocalmin",4);
        farmacie.adaugaMedicament(3,"Nurofen",4);

        farmacie.setareMedicament(1);
        System.out.println(farmacie.verificareDisponibilitate(3));
        System.out.println(farmacie.verificareDisponibilitate(5));

        SoftNou softNou = new Adaptor(farmacie);
        System.out.println( softNou.verificaStocPentruMedicament(2,3));


    }
}
