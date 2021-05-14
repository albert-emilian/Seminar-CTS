package ro.ase.cts.clase;

import java.sql.SQLOutput;

public class Facade {
    public static void verifica(Client client){
        if(VerificaDisponibiliatate.verifica(client) && VerificareCard.verifica(client) && VerificareReteta.verifica(client)){
            System.out.println("Clientul este in regule");
        }else{
            System.out.println("Clientul nu este in regula");
        }

    }
}
