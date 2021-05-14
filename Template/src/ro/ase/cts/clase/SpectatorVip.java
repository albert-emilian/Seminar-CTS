package ro.ase.cts.clase;

public class SpectatorVip extends SpectatorAbstract{
    private String nume;

    public SpectatorVip(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareCoada() {
        System.out.println("Spectatorul VIP " + this.nume + " s-a ajezat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul VIP" + this.nume + " a prezentat biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul VIP " + this.nume + " a fost controla");
    }

    @Override
    public void ocupaLocul() {
        System.out.println("Spectatorul VIP " + this.nume + " a ocupat locul");
    }
}
