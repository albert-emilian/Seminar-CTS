package ro.ase.cts.clase;

public class Medic {
    public static boolean verificaStare(Pacient pacient){
        if(pacient.getStare() == "internare")
            return true;
        return false;
    }
}
