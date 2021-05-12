package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements ISpital {

    protected ISpital spital;

    public DecoratorAbstract(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void printeazaRezulat() {
        spital.printeazaRezulat();
    }

    public abstract void posteazaRezultatOnline();
}