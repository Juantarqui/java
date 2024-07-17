package for1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int a;
        int s;
        int d= 0;
        int e;
        String nombre;
        do {
            System.out.println("introdusca empreados");
            e= new Scanner(System.in).nextInt();
        } while (e<1);
        for (int i = 1; i<=e ;i++) {
            do {
                System.out.println("introdusca nombre");
                 nombre = new Scanner(System.in).next();
                 System.out.println("introdusca sueldo");
                 s = new Scanner(System.in).nextInt();
                 System.out.println("introdusca años");
                 a = new Scanner(System.in).nextInt();
            } while (a < 0 || s < 0);
                if (s >= 2000 && s < 7000) {
                    if (a >7) {
                        double x = s+(s*0.10);
                        System.out.println("el nombre es: "+nombre +"    su nuevo sueldo es: "+x);
                    }else{
                        if (a > 6) {
                            double x = s+(s*0.07);
                            System.out.println("el nombre es: "+nombre +"    su nuevo sueldo es: "+x);
                        }else{
                            double x= s+(s*0.05);
                            System.out.println("el nombre es: "+nombre +"   su nuevo sueldo es: "+x);
                        }
                    }
                }else{
                    System.out.println("error");
                }
                
        }
       
        }
    }
