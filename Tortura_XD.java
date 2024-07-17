package for1;

import java.util.Scanner;
import java.lang.Math;

public class Tortura_XD {
    public static void main(String[] args) {
        int n;
        int NN;
        int F = 0;
        int TF = 0;
        do {
            n = new Scanner(System.in).nextInt();
        } while (n <0);
        for (int i = 0; n >0; i++) {
            NN = n % 10;
            n=n/10;
            F =(int) Math.pow(NN,i);
            TF= TF+F;
        }
        System.out.println(TF);
    }
}
