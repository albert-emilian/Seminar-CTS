package ro.ase.cts.clase;

public class DecoratorPaste extends  DecoratorAbstract{
    public DecoratorPaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste fericit!");
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();

        System.out.println("Paste fericit");
    }
}
