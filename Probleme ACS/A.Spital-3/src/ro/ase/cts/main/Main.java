package ro.ase.cts.main;

import ro.ase.cts.clase.FactoryMedic;
import ro.ase.cts.clase.IFactoryPersonal;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;

public class Main {
    public static void main(String[] args){

        IFactoryPersonal factoryMedic = new FactoryMedic();
        PersonalSpital medic = factoryMedic.getPersonal("Marius");
        System.out.println(medic);


    }
}
