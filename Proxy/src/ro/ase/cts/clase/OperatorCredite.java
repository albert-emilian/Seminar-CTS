package ro.ase.cts.clase;

public class OperatorCredite implements IOperatorCredite {

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        System.out.println("A fost realizat creditul de " + suma + " in " + moneda);
    }
}
