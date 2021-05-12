package ro.ase.cts.clase;

public class Ocupata implements State {
    @Override
    public void schimbaStare(Masa masa) {
        if(masa.getState() instanceof Libera){
            System.out.println("Masa a fost ocupata");
            masa.setState(this);
        }else{
            System.out.println("Masa nu poate fi ocupata");
        }
    }
}
