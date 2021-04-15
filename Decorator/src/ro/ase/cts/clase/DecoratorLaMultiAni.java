package ro.ase.cts.clase;

public class DecoratorLaMultiAni extends DecoratorAbstract {
    public DecoratorLaMultiAni(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("FELICITARE: La multi ani");
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        System.out.println("La multi ani!");
    }
}
