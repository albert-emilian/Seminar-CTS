package ro.ase.cts.clase;

public class Pacient {
    private State stare;
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    public State getStare() {
        return stare;
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(){
        State stareInternat = new Internat();
        stareInternat.schimbaStare(this);
    }

    public void externeazaPacient(){
        State stareExternare = new Externat();
        stareExternare.schimbaStare(this);
    }

    public void punePacientSubObservatie(){
        State stareSubObservatie = new SubObservatie();
        stareSubObservatie.schimbaStare(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("stare=").append(stare);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
