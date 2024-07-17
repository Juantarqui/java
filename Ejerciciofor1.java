package for1;

import java.util.Scanner;

public class Ejerciciofor1 {
    public static void main(String[] args) {
        //realizar un programa de factorial de un numero.
    int n = new Scanner(System.in).nextInt();
    int c=1;
    for (int i = 1; i <= n; i++){
         c = i * c;
    }
    System.out.println(c);
    }
}
