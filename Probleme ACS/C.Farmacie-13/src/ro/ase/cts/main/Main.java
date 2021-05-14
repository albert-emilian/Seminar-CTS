package ro.ase.cts.main;

import ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args){

        Reteta reteta = new Reteta();
        System.out.println(reteta);
        reteta.solicitaReteta();
        System.out.println(reteta);
        reteta.achizitioneazaReteta();
        System.out.println(reteta);


    }
}
