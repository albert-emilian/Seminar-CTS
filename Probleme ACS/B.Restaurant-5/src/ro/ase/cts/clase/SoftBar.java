package ro.ase.cts.clase;

public class SoftBar {
    private String numeCompanieSoft;

    public void vindeBautura(){
        System.out.println("Barul a vandut bautura prin softul facut de " + this.numeCompanieSoft);
    }

    public SoftBar(String numeCompanieSoft) {
        this.numeCompanieSoft = numeCompanieSoft;
    }
}
