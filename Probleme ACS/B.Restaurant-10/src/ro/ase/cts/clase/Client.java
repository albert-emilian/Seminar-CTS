package ro.ase.cts.clase;

public class Client implements IFlyweight{
    private String nume;
    private String email;
    private String numarTelefon;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public Client(String nume, String email, String numarTelefon) {
        this.nume = nume;
        this.email = email;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + rezervare.toString());
    }
}
