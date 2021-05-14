package ro.ase.cts.clase;

public class ComandaTrimiteDepozit extends Comanda{
    public ComandaTrimiteDepozit(Medicament medicament) {
        super(medicament);
    }

    @Override
    public void executa() {
        super.medicament.transportaMedicamentLaDepozit();
    }
}
