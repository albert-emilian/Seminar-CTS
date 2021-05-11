package ro.ase.cts.clase;

public class Spital {
    public static boolean internarePacient(Pacient pacient){
        if(Medic.verificaStare(pacient) && Salon.verificaPat(pacient))
            return true;
        return false;
    }
}
