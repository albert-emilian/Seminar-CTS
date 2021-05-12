package ro.ase.cts.clase;

public class Medicament {

    private String denumire;
    private int pret;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Medicament(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public void prezintaReteta(){
        System.out.println("Pentru achizitionare prezentati reteta");
    }


    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicamentul a fost achizitonat" + this.denumire);
    }





}
