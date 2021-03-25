package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("nume='").append(super.getNume()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
