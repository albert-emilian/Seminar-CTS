package ro.ase.cts.clase;

public class BonLaMultiAni extends DecoratorAbstract{
    public BonLaMultiAni(IBon bon) {
        super(bon);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("La multi ani!");
    }
}
