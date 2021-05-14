package ro.ase.cts.main;

import ro.ase.cts.clase.BuilderFactura;
import ro.ase.cts.clase.Factura;
import ro.ase.cts.clase.IBuilder;

public class Main {
    public static void main(String[] args){

        Factura factura = new BuilderFactura()
                .setCardFidelitate(true)
                .setCerePungi(true)
                .build();

        System.out.println(factura);


    }
}
