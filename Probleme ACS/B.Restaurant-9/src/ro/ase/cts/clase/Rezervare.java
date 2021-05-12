package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class Rezervare implements IRezervare {

    private int numarPersoane;
    private String numeRezervare;

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public Rezervare(int numarPersoane, String numeRezervare) {
        this.numarPersoane = numarPersoane;
        this.numeRezervare = numeRezervare;
    }

    @Override
    public void rezerva() {
        System.out.println("A fost realizata rezervare pe numele " + this.numeRezervare + " pentru " + this.numarPersoane +" persoane");
    }
}
