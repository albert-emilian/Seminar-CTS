package ro.ase.cts.clase;

public class VerificaDisponibiliatate {
    public static boolean verifica(Client client){
        if(client.isDisponibiliateMedicamente()){
            return true;
        }else{
            return false;
        }
    }
}
