package ro.ase.cts.main;

import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Pat;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args){

        Pat pat = new Pat(true, "Ana");
        Pat pat1 = new Pat(true, "Ana");
        Pat pat2 = new Pat(false, null);

        Salon.adaugaPat(pat);
        Salon.adaugaPat(pat1);
        Salon.adaugaPat(pat2);

        Pacient pacient = new Pacient("Andrei", "internare");

        if(Spital.internarePacient(pacient)){
            System.out.println("Pacientul a fost internat");
        }else{
            System.out.println("Pacientul nu a fost internat");
        }


    }
}
