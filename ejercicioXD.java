package for1;

import java.util.Scanner;

public class ejercicioXD {
    public static void main(String[] args) {
        int n ;
        int p = 0;
        int d = 0;
        int r = 0;
        int o = 0;
        int y=0;
        int c = 0;
        do {
            System.out.println("ingrese datos positivos");
            n = new Scanner(System.in).nextInt();
        } while (n < 0);
        while (c < 1) {
            r = n %10;
            n = n / 10;
            d = r;
            o = n %10;
            if (d % 2 == 0 && o %2 ==0) {
            }else{
               
                System.out.println(o);
            }
            c++;
            
        }
    }

}
