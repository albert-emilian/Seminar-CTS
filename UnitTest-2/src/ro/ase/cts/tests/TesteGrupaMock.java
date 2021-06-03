package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.mocks.FakeStudent;
import ro.ase.cts.tests.mocks.StubStudent;

import java.security.Guard;

import static org.junit.Assert.*;

public class TesteGrupaMock {

    @Test
    public void testAdaugaStudent(){
        IStudent student = new Student();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1,grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate(){
        IStudent student = new StubStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testGetPromovabiliatateFake(){

        Grupa grupa = new Grupa(1081);

        for(int i = 0; i < 8; i++){
            FakeStudent student = new FakeStudent();
            student.setAreRestanta(false);
            grupa.adaugaStudent(student);
        }

        for(int i = 0; i < 2; i++){
            FakeStudent student = new FakeStudent();
            student.setAreRestanta(true);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
    }

}