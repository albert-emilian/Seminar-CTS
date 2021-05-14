package ro.ase.cts.clase;

public class VerificareCard {
    public static boolean verifica(Client client){
        if(client.isCardSanatate()){
            return true;
        }else{
            return false;
        }
    }
}
