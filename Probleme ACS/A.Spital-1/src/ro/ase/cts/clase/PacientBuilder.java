package ro.ase.cts.clase;

public class PacientBuilder implements AbstractPacientBuilder {

    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient = new Pacient(nume,false,false,false);
    }

    public PacientBuilder adaugaRabatabil(boolean include){
        this.pacient.setPatRabatabil(include);
        return this;
    }

    public PacientBuilder adaugaMicdejun(boolean include){
        this.pacient.setMicdejun(include);
        return this;
    }

    public PacientBuilder adaugaPapuci(boolean include){
        this.pacient.setPapuciCamera(include);
        return this;
    }


    @Override
    public Pacient build() {
        return this.pacient;
    }
}
