package ro.ase.cts.clase;

public abstract class Comanda {
    protected Medicament medicament;
    public abstract void executa();

    public Comanda(Medicament medicament) {
        this.medicament = medicament;
    }
}
