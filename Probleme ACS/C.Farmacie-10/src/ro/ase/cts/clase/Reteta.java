package ro.ase.cts.clase;

public class Reteta {
    private int numarReteta;
    private float sumaPlata;
    private int numarMedicamente;


    public Reteta(int numarReteta, float sumaPlata, int numarMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaPlata = sumaPlata;
        this.numarMedicamente = numarMedicamente;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public float getSumaPlata() {
        return sumaPlata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarReteta=").append(numarReteta);
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append(", numarMedicamente=").append(numarMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
