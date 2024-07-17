package for1;

import java.util.Scanner;

public class lolol {
    public static void main(String[] args) {
        int n= new Scanner(System.in).nextInt();
        int c =0;
        int p;
        int t = 0;
        while (c < n) {
            p = new Scanner(System.in).nextInt();
            if (p >= 200) {
                double pd= p-(p*0.15);
                System.out.println("el consto es   "+pd);
            }else{
                if (p > 100) {
                    double pd= p-(p*0.12);
                    System.out.println("el costo es"+pd);
                }else{
                    double pd=p-(p*0.10);
                    System.out.println("el costo es "+pd);
                }
            }
           
            c++;
        }
    }
}
