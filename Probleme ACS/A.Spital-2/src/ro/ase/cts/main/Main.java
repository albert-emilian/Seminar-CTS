package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Main {
    public static void main(String[] args){

        PersonalSpital medic = new FactoryPersonal().getPersonal(TipPersonal.Medic, "Gheorghe");
        System.out.println(medic);

    }
}
