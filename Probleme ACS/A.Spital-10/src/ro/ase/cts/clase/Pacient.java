package ro.ase.cts.clase;

public class Pacient implements IFlyweight {
    private String nume;
    private String nrTelefon;
    private String adresa;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void getInfoSalon(Salon salon) {
        System.out.println("Salonul in care pacientul " + this.nume + "  este: " + salon.toString());
    }
}
