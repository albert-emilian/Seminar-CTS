package ro.ase.cts.main;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args){

             Reteta reteta = new Reteta(1,200,4);
             Reteta reteta1 = new Reteta(2,300,4);
             Reteta reteta2 = new Reteta(3,400,4);

            FlyweightFactory flyweightFactory = new FlyweightFactory();
            flyweightFactory.getClient(1).oferaReteta(reteta);
            flyweightFactory.getClient(1).oferaReteta(reteta1);
            flyweightFactory.getClient(2).oferaReteta(reteta2);

    }
}
