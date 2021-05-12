package ro.ase.cts.clase;

public class Pacient {

    private IPlata tipPlata;
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Pacient(String nume) {
        this.tipPlata = new PlataCash();
        this.nume = nume;
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(int suma){
        this.tipPlata.plata(suma);
    }

}
