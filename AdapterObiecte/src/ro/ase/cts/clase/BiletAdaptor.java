package ro.ase.cts.clase;

public class BiletAdaptor implements IBiletOnline{

    private Bilet bilet;

    public BiletAdaptor(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.rezervare();
    }
}
