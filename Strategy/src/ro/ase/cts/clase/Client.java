package ro.ase.cts.clase;

public class Client {
    private IPlata plata;

    public Client() {
        this.plata = new PlataCash();
    }

    public void setPlata(IPlata plata) {
        this.plata = plata;
    }

    public void realizeazaPlata(float suma){
        plata.plateste(suma);
    }
}
