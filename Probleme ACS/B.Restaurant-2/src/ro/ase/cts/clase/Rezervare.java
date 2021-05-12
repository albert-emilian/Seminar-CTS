package ro.ase.cts.clase;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decoreareMasa;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public Rezervare(boolean asezareGeam, boolean scaunErgonomic, boolean decoreareMasa, boolean muzicaAmbientala, boolean genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decoreareMasa = decoreareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isDecoreareMasa() {
        return decoreareMasa;
    }

    public void setDecoreareMasa(boolean decoreareMasa) {
        this.decoreareMasa = decoreareMasa;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public boolean isGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decoreareMasa=").append(decoreareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}
