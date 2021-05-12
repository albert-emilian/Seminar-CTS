package ro.ase.cts.clase;

public class Client {
    private IPlata tipPlata;
    private String nume;

    public Client(String nume) {
        this.tipPlata = new PlataCash();
        this.nume = nume;
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(){
        this.tipPlata.plateste();
    }
}
