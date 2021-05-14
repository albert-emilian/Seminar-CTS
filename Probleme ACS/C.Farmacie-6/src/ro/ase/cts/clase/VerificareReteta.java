package ro.ase.cts.clase;

public class VerificareReteta {
    public static boolean verifica(Client client){
        if(client.isReteta()){
            return true;
        }else{
            return false;
        }
    }
}
