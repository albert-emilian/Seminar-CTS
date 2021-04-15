package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorLaMultiAni;
import ro.ase.cts.clase.DecoratorPaste;
import ro.ase.cts.clase.NotaDePlata;

public class Main {

    public static void main(String[] args){

        NotaDePlata notaDePlata = new NotaDePlata(55);
        //notaDePlata.printeazaNota();

        DecoratorAbstract decoratorAbstract = new DecoratorLaMultiAni(notaDePlata);
        //decoratorAbstract.printeazaFelicitare();
        System.out.println();
        //decoratorAbstract.printeazaNota();


        DecoratorAbstract decoratorAbstract1 = new DecoratorPaste(notaDePlata);
      //  decoratorAbstract1.printeazaNota();

        NotaDePlata notaDePlata1 = new NotaDePlata(100);
        DecoratorLaMultiAni decoratorLaMultiAni = new DecoratorLaMultiAni(notaDePlata1);
        DecoratorPaste decoratorPaste = new DecoratorPaste(decoratorLaMultiAni);
        decoratorPaste.printeazaNota();



    }

}
