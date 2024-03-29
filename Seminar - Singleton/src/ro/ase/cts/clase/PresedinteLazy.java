package ro.ase.cts.clase;

public class PresedinteLazy {
    private  String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance = null;

    public PresedinteLazy() {
        this.nume = "PutinLazy";
        this.varsta = 68;
        this.mandat = 10;
    }

    private PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    public static synchronized PresedinteLazy getInstance(String nume,int varsta, int mandat){
        if(instance == null){
            return instance = new PresedinteLazy(nume,varsta,mandat);
        }
        return instance;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    public static void setInstance(PresedinteLazy instance) {
        PresedinteLazy.instance = instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresedinteLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}
