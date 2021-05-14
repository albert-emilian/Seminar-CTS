package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args){

        CasaMemoriala casaMemoriala = (CasaMemoriala) new FactoryCasaMemoriala().getObiectiv("1940", "Mihai viteazu");
        Muzeu muzeu = (Muzeu) new FactoryMuzeu().getObiectiv(2000f,"Antipa");
        Gradina gradina = (Gradina) new FactoryGradina().getObiectiv(25,"De vara");

        System.out.println(casaMemoriala);
        System.out.println(muzeu);
        System.out.println(gradina);
    }
}
