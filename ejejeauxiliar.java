package for1;

import java.util.Scanner;

public class ejejeauxiliar {
    public static void main(String[] args) {
        int n;
        int p = 0;
        int c=0;
        do {
            n = new Scanner(System.in).nextInt();
            p = new Scanner(System.in).nextInt();

        } while (p < 0 || n <0 );
        while (c < 1) {
            if (p  >= 200) {
                double m = p-(p*0.15);
                System.out.println("los productos adquiridos son"+n+"       el total es: "+p +"   el monto con el descuento de el 15% es de: "+m);
            }else{
                
            }
        }
    }
}
