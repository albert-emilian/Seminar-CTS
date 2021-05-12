package ro.ase.cts.clase;

public class SubObservatie implements State{
    @Override
    public void schimbaStare(Pacient pacient) {
        if(pacient.getStare() instanceof Internat){
            System.out.println("Pacientul a fost trecut sub observatie");
            pacient.setStare(this);
        }else{
            System.out.println("Pacientul nu paote fi trecut sub observatie");
        }

    }
}
