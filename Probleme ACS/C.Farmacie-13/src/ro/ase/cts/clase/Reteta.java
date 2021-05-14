package ro.ase.cts.clase;

public class Reteta {
    private State stare;

    public Reteta() {
        this.stare =  new StareEmisa();
    }

    public State getStare() {
        return stare;
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public void emiteReteta(){
        State stareEmisa = new StareEmisa();
        stareEmisa.schimbaStarea(this);
    }

    public void solicitaReteta(){
        State stareSolicitata = new StareSolicitata();
        stareSolicitata.schimbaStarea(this);
    }

    public void achizitioneazaReteta(){
        State stareAchizitionata = new StareAchizitionata();
        stareAchizitionata.schimbaStarea(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
