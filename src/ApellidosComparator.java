/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Comparator;

/**
 *
 * @author ivamar
 */
public class ApellidosComparator implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Alumno a1 = (Alumno) t;
        Alumno a2 = (Alumno) t1;
        return a1.getApellidos().compareTo(a2.getApellidos());
    }

    public boolean equals(Object o) {
        return this == o;
    }
}
