package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdaptor;
import ro.ase.cts.clase.BiletAdaptorClase;
import ro.ase.cts.clase.IBiletOnline;

public class Main {

    public static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }

    public static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet){
        bilet.rezervaBiletOnline();
        bilet.vindeBiletOnline();
    }

    public static void main(String[] args){

        Bilet bilet = new Bilet(30);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline biletOnline = new BiletAdaptor(bilet);
        rezervaSiAfiseazaBiletOnline(biletOnline);


        IBiletOnline iBiletOnline = new BiletAdaptorClase(50);
        rezervaSiAfiseazaBiletOnline(iBiletOnline);


    }
}
