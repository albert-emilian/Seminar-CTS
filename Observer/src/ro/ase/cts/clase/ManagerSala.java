package ro.ase.cts.clase;

public class ManagerSala extends Observable{

    public void anuntaMeci(String tipMeci){
        super.notificaObservator("Va avea loc un meci de " + tipMeci);
    }
}
