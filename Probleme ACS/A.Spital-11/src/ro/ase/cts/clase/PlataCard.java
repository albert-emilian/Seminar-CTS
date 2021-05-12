package ro.ase.cts.clase;

public class PlataCard implements IPlata{
    @Override
    public void plata(int suma) {
        System.out.println("A fost realizata plata cu cardul" + suma);
    }
}
