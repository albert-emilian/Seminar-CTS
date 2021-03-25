package ro.ase.cts.clase;


public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal personal, String nume){
            switch (personal){
                case Brancardier:
                    return new Brancardier(nume);
                case Asistent:
                    return new Asistent(nume);
                case Medic:
                    return new Medic(nume);

                default: throw new IllegalArgumentException();
            }
    }
}
