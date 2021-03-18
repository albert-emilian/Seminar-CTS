package ro.ase.cts.program;

import ro.ase.cts.clase.Maestru;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

    public static void main(String[] args){
        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        presedinte1.setNume("Joe Biden");
        presedinte1.setMandat(2);

       // System.out.println(presedinte1.toString());
       // System.out.println(presedinte2.toString());

        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("a",3,2);
        PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("b",1,4);

        //System.out.printf(presedinteLazy1.toString());
        // System.out.printf(presedinteLazy2.toString());

        Maestru maestru1 = Maestru.getInstance("x",1,3);
        Maestru maestru2 = Maestru.getInstance("y",3,4);


        System.out.println(maestru1.toString());
        System.out.println(maestru2.toString());
    }
}
