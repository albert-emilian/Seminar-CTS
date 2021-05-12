package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ProxySpital;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args){

        Pacient pacient = new Pacient("Ana", true);
        Pacient pacient1 = new Pacient("Marius", false);

        ISpital spital = new Spital();

        ISpital spitalProxy = new ProxySpital(spital);

        spital.internarePacient(pacient);
        spital.internarePacient(pacient1);
        System.out.println();
        spitalProxy.internarePacient(pacient);
        spitalProxy.internarePacient(pacient1);





    }
}
