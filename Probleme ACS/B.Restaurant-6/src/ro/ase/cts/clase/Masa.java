package ro.ase.cts.clase;

public class Masa {
    private boolean debarasata;
    private boolean libera;
    private boolean serveteleNoi;

    public boolean isDebarasata() {
        return debarasata;
    }

    public void setDebarasata(boolean debarasata) {
        this.debarasata = debarasata;
    }

    public boolean isLibera() {
        return libera;
    }

    public void setLibera(boolean libera) {
        this.libera = libera;
    }

    public boolean isServeteleNoi() {
        return serveteleNoi;
    }

    public void setServeteleNoi(boolean serveteleNoi) {
        this.serveteleNoi = serveteleNoi;
    }

    public Masa(boolean debarasata, boolean libera, boolean serveteleNoi) {
        this.debarasata = debarasata;
        this.libera = libera;
        this.serveteleNoi = serveteleNoi;
    }
}
