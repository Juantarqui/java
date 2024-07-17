package for1;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        int n;
        String nombre;
        int t ;
        int a;
        int e;
        int h=0;
        do {
            System.out.println("ingrese cantidad de estudiantes");
            n = new Scanner(System.in).nextInt();
        } while (n <0);
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("ingrese nombre de el estudiante");
                nombre = new Scanner(System.in).next();
                System.out.println("ingrese nota de trabajo practico");
                t = new Scanner(System.in).nextInt();
                System.out.println("ingresee nota de asistecia");
                a = new Scanner(System.in).nextInt();
                System.out.println("ingrese nota de examen");
                e = new Scanner(System.in).nextInt();
            } while (n<0||t <0||a<0||e<0 );
           if (t>0 && t<=60) {
            if (a >0 && a <=10) {
                if (e >0 && e<=30) {
                    h = t+a+e;
                }
            }else{
                System.out.println("la nota no coincide");
            }
           }else{
            System.out.println("la nota no coincide");
           }
           if (h >= 61) {
            System.out.println("la nota final es: "+h+"    el nombre del estudiante es:  "+nombre+  "    el estudiante esta aprobado");
        }else{
            System.out.println("la nota final es: "+h+"     el nombre del estudiante es:  "+nombre+"    esta reprobado");
        }
        }
       
    }
}
