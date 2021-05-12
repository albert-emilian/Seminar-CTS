package ro.ase.cts.clase;

public class SpitalOnline extends DecoratorAbstract{
    public SpitalOnline(ISpital spital) {
        super(spital);
    }

    @Override
    public void posteazaRezultatOnline() {
        System.out.println("Rezultatul a fost postat online");
    }

    @Override
    public void printeazaRezulat() {
        super.printeazaRezulat();
    }
}
