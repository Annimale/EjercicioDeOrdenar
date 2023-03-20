/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Alumno implements Comparable{
    private String apellidos;
    private float notamedia;

    public Alumno(String apellidos, float notamedia) {
        this.apellidos = apellidos;
        this.notamedia = notamedia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getNotamedia() {
        return notamedia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNotamedia(float notamedia) {
        this.notamedia = notamedia;
    }

    @Override
    public int compareTo(Object t) {
        Alumno otro = (Alumno) t;
        return apellidos.compareTo(otro.getApellidos());
    }

    @Override
    public String toString() {
        return "Alumno{" + "apellidos=" + apellidos + ", notamedia=" + notamedia + '}';
    }
    
    
    
}
