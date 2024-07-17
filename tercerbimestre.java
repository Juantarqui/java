package for1;

import java.util.Scanner;

public class tercerbimestre {
    public static void main(String[] args) {
        int n;
        int b =0;
        do {
            System.out.println("ingrese numero positivo");
             n = new Scanner(System.in).nextInt() ;   
        } while (n < 0);
        for (int i = 0 ; i <n ; i++){
            b = b +2;
            System.out.println(b);
        }
    }
}
