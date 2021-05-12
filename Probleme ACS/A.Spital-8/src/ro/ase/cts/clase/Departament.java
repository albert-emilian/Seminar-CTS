package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements FrunzaSectie {

    private List<FrunzaSectie> listaSectii;

    public Departament() {
        this.listaSectii = new ArrayList<FrunzaSectie>();
    }

    @Override
    public void adaugaNod(FrunzaSectie subdepartament) throws Exception {
        this.listaSectii.add(subdepartament);
    }

    @Override
    public FrunzaSectie getNod(int pozitie) throws Exception {
        return this.listaSectii.get(pozitie);
    }

    @Override
    public void stergeNod(FrunzaSectie subdepartament) throws Exception {
        this.listaSectii.remove(subdepartament);
    }

    @Override
    public void afiseazaSubdepartamente() throws Exception {
        for(FrunzaSectie subdepartament : this.listaSectii){
            System.out.println(subdepartament);
        }
    }
}
