package ro.ase.cts.clase;

public class StareSolicitata implements State{
    @Override
    public void schimbaStarea(Reteta reteta) {
        if(reteta.getStare() instanceof StareEmisa){
            reteta.setStare(this);
        }else{
            System.out.println("Reteta nu poate fi solicitata!");
        }
    }
}
