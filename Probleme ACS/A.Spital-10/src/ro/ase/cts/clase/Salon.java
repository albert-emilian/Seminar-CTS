package ro.ase.cts.clase;

public class Salon {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public int getNumarSalon() {
        return numarSalon;
    }

    public void setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }

    public int getNumarPat() {
        return numarPat;
    }

    public void setNumarPat(int numarPat) {
        this.numarPat = numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public Salon(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }
}
