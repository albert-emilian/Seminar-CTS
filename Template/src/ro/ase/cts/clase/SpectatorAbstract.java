package ro.ase.cts.clase;

public abstract class SpectatorAbstract {

    public abstract void asezareCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLocul();

    public final  void intrareStadion() {
        asezareCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupaLocul();
    }
}
