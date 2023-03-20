
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class EdadComparator implements Comparator{
    
    
    public int compare(Object o1, Object o2) {
        Alumno u1 = (Alumno) o1;
        Alumno u2 = (Alumno) o2;
    return (int) (u1.getNotamedia()- u2.getNotamedia());
 }
 public boolean equals(Object o) {
 return this == o;
 }
    }
    

