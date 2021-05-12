package ro.ase.cts.clase;

public class Libera implements State{
    @Override
    public void schimbaStare(Masa masa) {
        if(masa.getState() instanceof Ocupata){
            System.out.println("Masa a fost eliberata");
            masa.setState(this);
        }else{
            System.out.println("Masa nu a fost eliberata");
        }
    }
}
