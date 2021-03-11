package ro.ase.cts.program;

import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.beans.AppletInitializer;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException {
        return readAplicant.readAplicants();
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        System.out.println("Suma finantata Student: " + Student.getSumaFinantata());
        System.out.println("Suma finantata Angajat: " + Angajat.getSumaFinantata());
        System.out.println("Suma finantata Elev: " + Elev.getSumaFinantata());
        try {
            listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
            Proiect proiect = new Proiect(81);
            for (Aplicant aplicant : listaAplicanti){
                System.out.println(aplicant.toString());
                System.out.println(aplicant.getSumaFinanatare());
                System.out.println(aplicant.afisareRaspunsProiect(proiect));
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
