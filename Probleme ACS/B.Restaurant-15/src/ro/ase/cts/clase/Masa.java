package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupaMasa(){
        System.out.println("Masa a fost ocupata" + this.nrMasa);
    }

    public void rezervaMasa(){
        System.out.println("Masa a fost rezervata" + this.nrMasa);
    }


}
