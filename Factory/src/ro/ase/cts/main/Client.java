package ro.ase.cts.main;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Client {

    public static void main(String[] args){
        FactoryPersonal factoryPersonal = new FactoryPersonal();

        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,"Ana");
        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Marius");


        System.out.printf(asistent.toString());
        System.out.printf(medic.toString());

    }
}
