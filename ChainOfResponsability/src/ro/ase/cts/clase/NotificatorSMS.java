package ro.ase.cts.clase;

public class NotificatorSMS extends Notificator {

    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getNumarTelefon() != null){
            System.out.println("Client notificat prin sms: " + client.getNume() + "mesaj: " + text);
        }else{
            if(super.getNotificator() != null){
                super.getNotificator().trimiteNotificare(client, text);
            }else{
                System.out.println("Domnule manager nu au fost gasite datele de contact pentru clientul: " + client.getNume());
            }

        }
    }
}
