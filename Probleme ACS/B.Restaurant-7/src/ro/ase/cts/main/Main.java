package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.INota;
import ro.ase.cts.clase.Nota;
import ro.ase.cts.clase.NotaFelicitare;

public class Main {
    public static void main(String[] args){


        INota nota = new Nota();
        nota.printeazaNota();

        DecoratorAbstract notaFelicitare = new NotaFelicitare((Nota) nota);
        notaFelicitare.printeazaNota();
        notaFelicitare.printeazaFelicitare();





    }
}
