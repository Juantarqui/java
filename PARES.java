package for1;

import java.util.Scanner;

public class PARES {
    public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int p = 1;
    int d = 0;
    int r = 0;
    while (n > 0) {
        d = n % 10;
        n = n / 10;
        if (d % 2 != 0) {
            r = (d*p)+r;
            p = p*10;
        }
    }   
    System.out.println(r); 
    }
}
