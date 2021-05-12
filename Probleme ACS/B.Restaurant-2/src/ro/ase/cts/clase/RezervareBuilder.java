package ro.ase.cts.clase;

import java.util.Objects;

public class RezervareBuilder implements AbstractRezervareBuilder {

    private Rezervare rezervare;


    public RezervareBuilder() {
        this.rezervare = new Rezervare(false,false,false,false,false);
    }

    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setDecoreareMasa(boolean decoreareMasa) {
        this.rezervare.setDecoreareMasa(decoreareMasa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }



    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
