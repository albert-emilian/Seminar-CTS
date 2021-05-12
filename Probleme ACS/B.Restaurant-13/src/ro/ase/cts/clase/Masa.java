package ro.ase.cts.clase;

public class Masa {
    private State state;

    public Masa() {
        this.state = new Libera();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void ocupaMasa(){
        State stareOcupata = new Ocupata();
        stareOcupata.schimbaStare(this);
    }

    public void rezervaMasa(){
        State stareRezervata = new Rezervata();
        stareRezervata.schimbaStare(this);
    }

    public void elibereazaMasa(){
        State stareEliberata = new Libera();
        stareEliberata.schimbaStare(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
