package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {

    private static List<Pat> listaPaturi = new ArrayList<Pat>();

    public static void adaugaPat(Pat pat){
        listaPaturi.add(pat);
    }

    public static boolean verificaPat(Pacient pacient){
        int count = 0;
        for(Pat pat : listaPaturi){
            if(pat.isOcupat() == false){
                count++;
                if(count == 1){
                    pat.setOcupat(true);
                    pat.setNumePacient(pacient.getNume());
                    return true;
                }
            }
        }
        return false;
    }
}
