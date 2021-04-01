package ro.ase.cts.clase;

public class Rezervare {
    private int codRezervare;
    private Boolean areMancare;
    private Boolean areScaunErgonomic;
    private Boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare(int codRezervare, Boolean areMancare, Boolean areScaunErgonomic, Boolean areMuzicaAmbientala, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public Boolean getAreMancare() {
        return areMancare;
    }

    public void setAreMancare(Boolean areMancare) {
        this.areMancare = areMancare;
    }

    public Boolean getAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(Boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public Boolean getAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public void setAreMuzicaAmbientala(Boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public Rezervare() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancare=").append(areMancare);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
