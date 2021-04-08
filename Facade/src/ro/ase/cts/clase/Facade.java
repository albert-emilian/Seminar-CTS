package ro.ase.cts.clase;

public class Facade {

    public static boolean esteEligibil(Persoana persoana){
        return persoana.getVarsta() < 18 && BirouDeCredite.areDatorie(persoana) && Politie.esteUrmarit(persoana);
    }

}
