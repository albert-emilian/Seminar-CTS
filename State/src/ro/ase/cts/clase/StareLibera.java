package ro.ase.cts.clase;

public class StareLibera implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Nu putem face aceasta modificare!");
        }else{
            masa.setStare(this);
            System.out.println("Masa s-a eliberat");
        }
    }
}
