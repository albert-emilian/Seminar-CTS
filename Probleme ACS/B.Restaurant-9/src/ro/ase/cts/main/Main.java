package ro.ase.cts.main;

import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.ProxyRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){

        IRezervare rezervare = new Rezervare(3,"Marius");
        rezervare.rezerva();

        IRezervare proxyRezervare = new ProxyRezervare((Rezervare) rezervare);
        proxyRezervare.rezerva();


    }
}
