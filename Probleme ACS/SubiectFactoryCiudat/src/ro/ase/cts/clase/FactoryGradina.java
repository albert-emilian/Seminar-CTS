package ro.ase.cts.clase;

public class FactoryGradina implements AbstractFactory{
    @Override
    public AObiectivTuristic getObiectiv(Object object, String nume) {
        return new Gradina("nume",(Integer) object);
    }
}
