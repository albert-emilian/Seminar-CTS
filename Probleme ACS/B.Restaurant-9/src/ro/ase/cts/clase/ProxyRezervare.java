package ro.ase.cts.clase;

public class ProxyRezervare implements IRezervare{

    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }



    @Override
    public void rezerva() {
        if(rezervare.getNumarPersoane() >= 4){
            this.rezervare.rezerva();
        }else{
            System.out.println("Rezervarea nu a fost realizata. Puteti sa " +
                    "va prezentati la restaurant deoarece sunt destule mese libere de 2 persoane");
        }
    }
}
