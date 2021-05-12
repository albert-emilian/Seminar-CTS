package ro.ase.cts.main;

import ro.ase.cts.clase.IPlata;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args){

        IPlata plataCard = new PlataCard();
        IPlata plataCash = new PlataCash();

        Pacient pacient = new Pacient("Andrei");
        pacient.plateste(23);
        pacient.setTipPlata(new PlataCard());
        pacient.plateste(23);

    }
}
