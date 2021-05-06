package ro.ase.cts.clase;

public class PlataCard implements IPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("A platit cu cardul suma:" + suma);
    }
}
