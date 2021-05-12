package ro.ase.cts.clase;

public class Rezervata implements State{
    @Override
    public void schimbaStare(Masa masa) {
        if(masa.getState() instanceof Libera){
            System.out.println("Masa a fost rezervata");
            masa.setState(this);
        }else{
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
