package ro.ase.cts.clase;

public class PlataCash implements IPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("A fost facuta plata cash: " + suma);
    }
}
