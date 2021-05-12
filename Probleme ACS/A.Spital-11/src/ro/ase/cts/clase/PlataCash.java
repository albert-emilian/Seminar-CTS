package ro.ase.cts.clase;

public class PlataCash implements IPlata {

    @Override
    public void plata(int suma) {
        System.out.println("A fost realizata plata cash " + suma);
    }
}
