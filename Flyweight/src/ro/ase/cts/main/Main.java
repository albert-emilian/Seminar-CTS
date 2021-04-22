package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {

    public static void main(String[] args){

        Rezervare rezervare = new Rezervare(1,2,15);
        Rezervare rezervare1 = new Rezervare(2,2,16);
        Rezervare rezervare2 = new Rezervare(3,2,17);
        Rezervare rezervare3 = new Rezervare(4,2,18);

        FlyweightFactory factoryClienti = new FlyweightFactory();
        factoryClienti.getFlyweight("1234").printeazaRezervarea(rezervare);

        factoryClienti.getFlyweight("1234").printeazaRezervarea(rezervare2);
        factoryClienti.getFlyweight("123456").printeazaRezervarea(rezervare3);
        factoryClienti.getFlyweight("123456").printeazaRezervarea(rezervare1);




    }
}
