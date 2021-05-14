package ro.ase.cts.clase;

public class Client implements IClient {
    private String nume;
    private int numarAsigurare;

    public Client(String nume, int numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }


    public String getNume() {
        return nume;
    }

    public int getNumarAsigurare() {
        return numarAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarAsigurare=").append(numarAsigurare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void oferaReteta(Reteta reteta) {
        System.out.println("Clientul " + this.toString() + " are reteta: " + reteta.toString());
    }
}
