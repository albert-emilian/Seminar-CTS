package ro.ase.cts.clase;

public class Maestru {
    private  String nume;
    private int varsta;
    private int vechime;

    private Maestru(String nume, int varsta, int vechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Maestru{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    private Maestru() {
        this.nume = "a";
        this.varsta = 3;
        this.vechime = 4;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public static void setInstance(Maestru instance) {
        Maestru.instance = instance;
    }

    private static Maestru instance = null;

    public static synchronized Maestru getInstance(String nume, int varsta, int vechime){
        if(instance == null){
            return instance = new Maestru(nume,varsta,vechime);
        }
        return  instance;
    }
}
