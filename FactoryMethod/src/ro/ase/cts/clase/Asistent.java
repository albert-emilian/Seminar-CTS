package ro.ase.cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("nume='").append(super.getNume()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
