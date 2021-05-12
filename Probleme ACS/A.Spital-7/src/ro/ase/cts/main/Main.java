package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.Spital;
import ro.ase.cts.clase.SpitalOnline;

public class Main {
    public static void main(String[] args){

        Spital spital = new Spital();
        spital.printeazaRezulat();

        DecoratorAbstract spitalOnline = new SpitalOnline(spital);
        spitalOnline.posteazaRezultatOnline();
        spitalOnline.printeazaRezulat();

    }

}
