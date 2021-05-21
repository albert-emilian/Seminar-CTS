package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructorUnParametru(){
        String nume = "Costica";
        Student student = new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testCtrFaraParams(){
        Student student = new Student();

        assertNotNull("Atributul nota nu a fost initializat",student.getNote());
        assertNotNull("Atributul nume nu a fost initializat",student.getNume());
    }

    @Test
    public void adaugaNota(){
        Student student = new Student();
        int nota = 5;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testAdaugaNotaDimensiune(){
        Student student = new Student();

        int nota = 5;
        student.adaugaNota(5);
        int nota1 = 8;
        student.adaugaNota(nota1);

        assertEquals(2,student.getNote().size());

    }

    //regula 0 1 n pentru metode ce lucreaza cu colectii situatia in care nu avem niciun element/ situatia cand avem un element
    // si situatia cand avem mai multe elemente
    @Test
    public void testCalculeazaMedie(){
        Student student = new Student();

        student.adaugaNota(5);
        student.adaugaNota(8);

        assertEquals(6.5f,student.calculeazaMedie(),0.001);
    }

    @Test
    public void testCalculeazaMedieFaraNote(){
        Student student = new Student();

        assertEquals(0,student.calculeazaMedie(),0.001);
    }

    @Test
    public void testCalculeazaMedieSinguraNota(){
        Student student = new Student();

        student.adaugaNota(4);

        assertEquals(4,student.calculeazaMedie(),0.001);
    }

    @Test
    public void testNuAreRestante(){
        Student student = new Student();

        student.adaugaNota(6);
        student.adaugaNota(4);

        assertTrue( student.areRestante());
    }

    @Test
    public void testAreRestante(){
        Student student = new Student();

        student.adaugaNota(6);
        student.adaugaNota(6);

        assertFalse( student.areRestante());
    }

    @Test
    public void testGetNotaExceptie(){
        Student student = new Student();
        student.adaugaNota(6);
        student.adaugaNota(6);

        try{
            student.getNota(5);
            fail("Nu a aruncat exceptie");
        }catch (IndexOutOfBoundsException e){

        }catch (Exception e){
            fail("Metoda arunca o alta exceptie");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptieJ4(){
        Student student = new Student();
        student.adaugaNota(6);
        student.adaugaNota(6);

        student.getNota(5);

    }




}