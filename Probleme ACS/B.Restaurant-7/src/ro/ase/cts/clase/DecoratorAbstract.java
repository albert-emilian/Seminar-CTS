package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements INota{

    private Nota nota;

    public DecoratorAbstract(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
    }

    public abstract void printeazaFelicitare();

}
