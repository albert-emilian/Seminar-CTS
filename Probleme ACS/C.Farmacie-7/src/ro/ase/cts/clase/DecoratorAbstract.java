package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements IBon {

    private IBon bon;

    public DecoratorAbstract(IBon bon) {
        this.bon = bon;
    }

    @Override
    public void printeaza() {
        this.bon.printeaza();
    }

    public abstract void printeazaFelicitare();
}
