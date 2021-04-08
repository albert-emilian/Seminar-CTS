package ro.ase.cts.main;

import ro.ase.cts.clase.Agentie;
import ro.ase.cts.clase.FrunzaFiliala;

public class Main {

    public static void main(String[] args){

        Agentie agentie1 = new Agentie();
        Agentie agentie2 = new Agentie();

        FrunzaFiliala frunzaFiliala1 = new FrunzaFiliala("Bucuresti");
        FrunzaFiliala frunzaFiliala2 = new FrunzaFiliala("Targoviste");
        FrunzaFiliala frunzaFiliala3 = new FrunzaFiliala("Arad");

        agentie1.adaugaNod(frunzaFiliala1);
        agentie1.adaugaNod(frunzaFiliala2);
        agentie2.adaugaNod(frunzaFiliala3);

        agentie1.afiesazaDescriere();
        agentie2.afiesazaDescriere();


    }

}
