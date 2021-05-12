package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args){

        IFactorySupa factoryLegume = new FactorySupaLegume();
        IFactorySupa factoryVita = new FactorySupaVita();
        IFactorySupa factoryCiuperci = new FactorySupaCiuperci();

        ISupa vita = factoryVita.getSupa();
        ISupa legume = factoryLegume.getSupa();
        ISupa ciuperci = factoryCiuperci.getSupa();

        vita.serverste();
        legume.serverste();
        ciuperci.serverste();
    }
}
