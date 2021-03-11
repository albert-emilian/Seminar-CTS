package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static float sumaFinanatare = 20;

    public  float getSumaFinanatare() {
        return sumaFinanatare;
    }

    public static float getSumaFinantata(){
        return sumaFinanatare;
    }

    public static void setSumaFinanatare(float sumaFinanatare) {
        Student.sumaFinanatare = sumaFinanatare;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn_studii() {
        return an_studii;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Student: ")
                .append(super.toString())
                .append("Facultate: ")
                .append(facultate)
                .append("Ani studii: ")
                .append(an_studii);

        return stringBuilder.toString();
    }
}
