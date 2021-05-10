package ro.ase.cts.clase;

public class Masa {
    private Stare stare;
    private int numarMasa;


    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.stare= new StareLibera();
    }


    public void rezervaMasa(){
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }


}
