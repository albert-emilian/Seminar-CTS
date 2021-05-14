package ro.ase.cts.main;

import ro.ase.cts.clase.Spectator;
import ro.ase.cts.clase.SpectatorAbstract;
import ro.ase.cts.clase.SpectatorVip;

public class Main {
    public static void main(String[] args){
        SpectatorAbstract spectator = new Spectator("Marius");
        SpectatorAbstract spectatorVIP = new SpectatorVip("Mihai");

        spectator.intrareStadion();
        spectatorVIP.intrareStadion();

    }
}
