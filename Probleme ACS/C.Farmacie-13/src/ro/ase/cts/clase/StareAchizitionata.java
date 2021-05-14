package ro.ase.cts.clase;

public class StareAchizitionata implements State {
    @Override
    public void schimbaStarea(Reteta reteta) {
        if(reteta.getStare() instanceof StareSolicitata){
            reteta.setStare(this);
        }else{
            System.out.println("Reteta nu poate fi achizitionata!");
        }
    }
}
