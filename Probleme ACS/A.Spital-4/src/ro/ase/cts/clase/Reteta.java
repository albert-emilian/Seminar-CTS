package ro.ase.cts.clase;

public class Reteta implements AbstractPrototype {
    private String cantitate;
    private String nume;

    public Reteta() {
    }

    public String getCantitate() {
        return cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitate='").append(cantitate).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setCantitate(String cantitate) {
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Reteta(String cantitate, String nume) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    @Override
    public Reteta copy() {
        Reteta reteta = new Reteta();
        reteta.setCantitate(this.cantitate);
        reteta.setNume(this.nume);
        return  reteta;
    }
}
