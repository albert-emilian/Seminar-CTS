package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micdejun;
    private boolean papuciCamera;


    public Pacient(String nume, boolean patRabatabil, boolean micdejun, boolean papuciCamera) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micdejun = micdejun;
        this.papuciCamera = papuciCamera;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicdejun() {
        return micdejun;
    }

    public void setMicdejun(boolean micdejun) {
        this.micdejun = micdejun;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micdejun=").append(micdejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append('}');
        return sb.toString();
    }
}
