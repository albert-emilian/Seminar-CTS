package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private boolean asigurare;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAsigurare() {
        return asigurare;
    }

    public void setAsigurare(boolean asigurare) {
        this.asigurare = asigurare;
    }

    public Pacient(String nume, boolean asigurare) {
        this.nume = nume;
        this.asigurare = asigurare;
    }
}
