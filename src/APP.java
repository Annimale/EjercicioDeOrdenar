
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class APP {

    public static void main(String[] args) {

        ArrayList<Alumno> lista = new ArrayList();
        Alumno a1 = new Alumno("Pepe", 23);
        Alumno a2 = new Alumno("Xse", 43);
        Alumno a3 = new Alumno("Aese", 13);
        Alumno a4 = new Alumno("Cese", 3);
        Alumno a5 = new Alumno("Bese", 63);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\n" + "ORDENAMOS COMPARABLE");
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
        System.out.println("\n" + "ORDENAMOS COMPARATOR");
        Collections.sort(lista, new ApellidosComparator());
        for (int j = 0; j < lista.size(); j++) {
            System.out.println(lista.get(j));

           

        }
         System.out.println("\n" + "ORDENAMOS NOTA MEDIA");
            Collections.sort(lista, new EdadComparator());

            for (int a = 0; a < lista.size(); a++) {
                System.out.println(lista.get(a));

            }
    }
}
