package ro.ase.cts.clase;

public class Client implements AbstractPrototypeClient {
    private String nume;
    private String varsta;

    public String getNume() {
        return nume;
    }

    public Client() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public Client(String nume, String varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta='").append(varsta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototypeClient clone() {
        Client client = new Client();
        client.setNume(this.nume);
        client.setVarsta(this.varsta);
        return client;
    }
}
