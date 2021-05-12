package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class Internat implements State{
    @Override
    public void schimbaStare(Pacient pacient) {
        if(pacient.getStare() instanceof SubObservatie || pacient.getStare() instanceof Externat ){
            System.out.println("Pacientul nu poate fi internat");
        }else{
            System.out.println("Pacientul a fost internat");
            pacient.setStare(this);
        }
    }
}
