package ro.ase.cts.main;

import ro.ase.cts.clase.FactorySupa;
import ro.ase.cts.clase.ISupa;
import ro.ase.cts.clase.TipSupa;

public class Main {
    public static void main(String[] args){


        ISupa supa = new FactorySupa().getSupa(TipSupa.SupaVita);
        supa.serversteSupa();
    }
}
