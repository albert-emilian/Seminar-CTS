package ro.ase.cts.main;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.IFlyweight;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args){

        Salon salon = new Salon(1,2,3);
        Salon salon1 = new Salon(2,3,4);
        Salon salon2 = new Salon(3,4,5);

        FlyweightFactory flyweight =  new FlyweightFactory();
        flyweight.getPacient("1234").getInfoSalon(salon);
        flyweight.getPacient("1234").getInfoSalon(salon1);
        flyweight.getPacient("123456").getInfoSalon(salon);



    }
}
