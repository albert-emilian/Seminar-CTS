package ro.ase.cts.clase;

public class Externat implements State{
    @Override
    public void schimbaStare(Pacient pacient) {
        if(pacient.getStare() instanceof Internat || pacient.getStare() instanceof SubObservatie ){
            System.out.println("Pacientul a fost externat");
            pacient.setStare(this);
        }else{
            System.out.println("Pacientul nu poate fi externat");
        }
    }
}
