package ro.ase.cts.main;

import ro.ase.cts.clase.Adaptor;
import ro.ase.cts.clase.SoftBar;
import ro.ase.cts.clase.SoftBarNou;

public class Main {
    public static void main(String[] args){

        SoftBar softbarvechi = new SoftBar("Ghirgheni");
        softbarvechi.vindeBautura();
        Adaptor adaptor = new Adaptor("Mereni");
        adaptor.vindeBauturaNou();


    }
}
