package ro.ase.cts.clase;

public class Reteta implements PrototipAbstract {

    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    public Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    public String getDenumireSolutie() {
        return denumireSolutie;
    }

    public void setDenumireSolutie(String denumireSolutie) {
        this.denumireSolutie = denumireSolutie;
    }

    public int getCantitateSolutie() {
        return cantitateSolutie;
    }

    public void setCantitateSolutie(int cantitateSolutie) {
        this.cantitateSolutie = cantitateSolutie;
    }

    @Override
    public PrototipAbstract copiaza() {
        Reteta copie = new Reteta();
        copie.setCantitateSolutie(this.cantitateSolutie);
        copie.setDenumireSolutie(this.denumireSolutie);

        return copie;
    }
}
