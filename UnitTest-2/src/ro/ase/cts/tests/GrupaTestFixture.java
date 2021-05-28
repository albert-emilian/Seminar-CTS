package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class GrupaTestFixture {

    private Grupa grupa = null;

    @Before
    public void setup(){
        this.grupa = new Grupa(1001);

        for(int i = 0 ; i < 10; i++){
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for(int i = 0 ; i < 25; i++){
            Student student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testPromovabilitatePerformance(){
        grupa.getPromovabilitate();
    }



}