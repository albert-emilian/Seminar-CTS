package ro.ase.cts.clase;

public class ProxySpital implements ISpital{

    private ISpital spital;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void internarePacient(Pacient pacient) {
        if(pacient.isAsigurare()){
            spital.internarePacient(pacient);
        }else{
            System.out.println("Pacientul nu are asigurare, nu a fost internat");
        }
    }
}
