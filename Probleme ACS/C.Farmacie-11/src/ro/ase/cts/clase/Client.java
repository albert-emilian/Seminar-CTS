package ro.ase.cts.clase;

public class Client {
    private String nume;
    private IPlata plata;


    public Client(String nume) {
        this.nume = nume;
        this.plata = new PlataCash();
    }


    public void setPlata(IPlata plata) {
        this.plata = plata;
    }

    public void plateste(float suma){
        this.plata.plateste(suma);
    }
}
