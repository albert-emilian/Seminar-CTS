package ro.ase.cts.main;

import ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args){
        Reteta reteta = new Reteta("3","asdf");
        Reteta reteta1 = reteta.copy();

        System.out.println(reteta);
        System.out.println(reteta1);



    }
}
