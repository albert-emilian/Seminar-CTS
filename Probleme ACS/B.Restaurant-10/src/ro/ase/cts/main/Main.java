package ro.ase.cts.main;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){

        Rezervare rezervare = new Rezervare(1,2,"3");
        Rezervare rezervare1 = new Rezervare(2,3,"4");
        Rezervare rezervare2 = new Rezervare(13,4,"5");

        FlyweightFactory factory = new FlyweightFactory();
        factory.getClient("a@gmail.com").afiseazaRezervare(rezervare);
        factory.getClient("a@gmail.com").afiseazaRezervare(rezervare1);
        factory.getClient("a@gmail.com").afiseazaRezervare(rezervare2);


    }
}
