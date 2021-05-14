package ro.ase.cts.main;

import ro.ase.cts.clase.Bon;
import ro.ase.cts.clase.BonLaMultiAni;
import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.IBon;

public class Main {
    public static void main(String[] args){
        Bon bon = new Bon();
        bon.printeaza();

        DecoratorAbstract felicitare = new BonLaMultiAni(bon);
        felicitare.printeazaFelicitare();

    }
}
