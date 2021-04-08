package ro.ase.cts.clase;

public class FrunzaFiliala implements ISediu{

    private String numeFiliala;

    public FrunzaFiliala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiesazaDescriere() {
        System.out.println("Este filiala " + numeFiliala);
    }

    @Override
    public void adaugaNod(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeNod(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public ISediu getNod(int pozitie) throws Exception {
        throw new Exception("Nu este implementata");
    }
}
