package ro.ase.cts.clase;

public class RezervareBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0, false, false, false, "" );
    }

    public RezervareBuilder(int cod) {
        this.rezervare = new Rezervare(cod, false, false, false, "" );
    }


    public RezervareBuilder setCodRezervare(int cod){
        rezervare.setCodRezervare(cod);
        return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic){
        rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public RezervareBuilder setAreMuzica(boolean areMuzica){
        rezervare.setAreMuzicaAmbientala(areMuzica);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
