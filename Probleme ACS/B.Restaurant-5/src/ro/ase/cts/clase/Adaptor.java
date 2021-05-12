package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class Adaptor extends SoftBarNou {

    public Adaptor(String numeSoftNou) {
        super(numeSoftNou);
    }

    @Override
    public void vindeBauturaNou() {
        System.out.println("Barul a vandut bautura prin softul facut de " + super.numeSoftNou);
    }
}
