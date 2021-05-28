package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class GrupaTest {


    //Right
    @Test
    public void testNumarGrupa(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }


    @Test
    public void testConstructorExistance(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    //Boundary
    @Test
    public void testLimitaSuperioaraGrupa(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    //Boundary
    @Test
    public void testLimitaInferioaraGrupa(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    //Error
    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructorInferior(){
        Grupa grupa = new Grupa(900);
    }

    //Error
    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructorSuperior(){
        Grupa grupa = new Grupa(1101);
    }

    //Performance
    @Test(timeout = 500)
    public void testPerformanceConstructor(){
        Grupa grupa = new Grupa(1005);
    }

    //Right
    @Test
    public void testPromovabilitateRight(){
        Grupa grupa = new Grupa(1001);

        for(int i = 0 ; i < 10; i++){
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for(int i = 0 ; i < 5; i++){
            Student student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66f,grupa.getPromovabilitate(),0.01);
    }

    //Boundary
    @Test
    public  void testGetPromovabilitateInferior(){
        Grupa grupa = new Grupa(1001);
        for(int i = 0 ; i < 5; i++){
            Student student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }

    //Boundary
    @Test
    public  void testGetPromovabilitateSuperior(){
        Grupa grupa = new Grupa(1001);

        for(int i = 0 ; i < 10; i++){
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testPromovabilitateErrorCondition(){
        Grupa grupa = new Grupa(1050);

        grupa.getPromovabilitate();
    }

    @Test
    public void testPromovabilitateCardinalititOne(){
        Grupa grupa = new Grupa(1081);
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(6);
        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(), 0.01);
    }







}