package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class StareOcupata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa " + masa.getNumarMasa() + " a fost rezervata");
            masa.setStare(this);
        }else{
            System.out.println("Masa nu poate fi ocupata");
        }
    }
}
