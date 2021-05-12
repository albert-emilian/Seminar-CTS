package ro.ase.cts.clase;

public class Spital implements ISpital{
    @Override
    public void internarePacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
    }
}
