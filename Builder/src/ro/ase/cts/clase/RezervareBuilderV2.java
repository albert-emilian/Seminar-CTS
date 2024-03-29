package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder{
    private int codRezervare;
    private Boolean areMancare;
    private Boolean areScaunErgonomic;
    private Boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderV2() {
        this.codRezervare = 100;
        this.areMancare= false;
        this.areScaunErgonomic = false;
        this.areMuzicaAmbientala = false;
        this.genMuzica = "";
    }

    public RezervareBuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervareBuilderV2 setAreMancare(Boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RezervareBuilderV2 setAreScaunErgonomic(Boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setAreMuzicaAmbientala(Boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancare,areScaunErgonomic,areMuzicaAmbientala,genMuzica);
    }
}
