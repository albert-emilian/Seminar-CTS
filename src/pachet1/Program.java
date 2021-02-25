package pachet1;

import clase.Girafa;
import clase.Zoo;

public class Program {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Girafa girafa1 = new Girafa("Girafa 1");
        Girafa girafa2 = new Girafa("Girafa 2");

        zoo.adaugaAnimal(girafa1);
        zoo.adaugaAnimal(girafa2);

        zoo.feedAnimals();
    }
}
