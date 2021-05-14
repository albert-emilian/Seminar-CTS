package ro.ase.cts.clase;

public class StareEmisa implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        reteta.setStare(this);
    }
}
