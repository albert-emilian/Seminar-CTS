package ro.ase.cts.clase;

public abstract class AObiectivTuristic {
    private String nume;
    private Object atributSpecific;

    public AObiectivTuristic(String nume, Object atributSpecific) {
        this.nume = nume;
        this.atributSpecific = atributSpecific;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Object getAtributSpecific() {
        return atributSpecific;
    }

    public void setAtributSpecific(Object atributSpecific) {
        this.atributSpecific = atributSpecific;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AObiectivTuristic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", atributSpecific=").append(atributSpecific);
        sb.append('}');
        return sb.toString();
    }
}
