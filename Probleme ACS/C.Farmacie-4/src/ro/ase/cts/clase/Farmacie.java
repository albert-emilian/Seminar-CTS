package ro.ase.cts.clase;

import java.util.HashMap;

public class Farmacie {

    private HashMap<Integer,Medicament> listaMedicament;
    private Medicament medicamentSelectat;

    public Farmacie() {
        this.listaMedicament = new HashMap<Integer, Medicament>();
    }

    public void adaugaMedicament(int id,String denumire, int stoc){
        Medicament medicament = new Medicament(stoc,id,denumire);
        this.listaMedicament.put(id,medicament);
    }

    public void setareMedicament(int idMedicament){
        this.medicamentSelectat = this.listaMedicament.get(idMedicament);
    }

    public boolean verificareDisponibilitate(int nrBucati){
        if(this.medicamentSelectat != null){
            if(nrBucati > this.medicamentSelectat.getNrStoc())
                return false;
            return true;
        }else{
            return false;
        }
    }
}
