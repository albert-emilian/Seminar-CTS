package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Notificator;
import ro.ase.cts.clase.NotificatorEmail;
import ro.ase.cts.clase.NotificatorSMS;

public class Main {

    public static void main(String[] args){

        Client client1 = new Client("Ion","333","abx@gmail.com");
        Client client2 = new Client("Marius",null,"bbb@gmail.com");
        Client client3 = new Client("Mihai","555",null);
        Client client4 = new Client("Mihai",null,null);

        Notificator notificatorSMS= new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        notificatorSMS.trimiteNotificare(client1,"aaa");
        notificatorEmail.setNotificator(notificatorSMS);
        notificatorEmail.trimiteNotificare(client3,"mmmm");
        notificatorSMS.trimiteNotificare(client4,"aaa");

    }
}
