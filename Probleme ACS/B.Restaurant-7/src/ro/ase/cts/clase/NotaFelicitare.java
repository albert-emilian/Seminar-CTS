package ro.ase.cts.clase;

public class NotaFelicitare extends DecoratorAbstract{


    public NotaFelicitare(Nota nota) {
        super(nota);
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
