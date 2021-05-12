package ro.ase.cts.main;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;

public class Main {
    public static void main(String[] args){

        Masa masa = new Masa(true,true,true);
        Masa masa1 = new Masa(false,true,true);
        Facade.esteMasaPregatita(masa);
        Facade.esteMasaPregatita(masa1);

    }
}
