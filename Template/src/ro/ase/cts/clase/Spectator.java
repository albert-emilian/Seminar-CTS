package ro.ase.cts.clase;

public class Spectator extends SpectatorAbstract {
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }


    @Override
    public void asezareCoada() {
        System.out.println("Spectatorul " + this.nume + " s-a ajezat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul " + this.nume + " a prezentat biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul " + this.nume + " a fost controla");
    }

    @Override
    public void ocupaLocul() {
        System.out.println("Spectatorul " + this.nume + " a ocupat locul");
    }
}
