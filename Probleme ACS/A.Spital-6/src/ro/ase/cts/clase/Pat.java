package ro.ase.cts.clase;

public class Pat {
    private boolean ocupat;
    private String numePacient;

    public boolean isOcupat() {
        return ocupat;
    }

    public void setOcupat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public Pat(boolean ocupat, String numePacient) {
        this.ocupat = ocupat;
        this.numePacient = numePacient;
    }
}
